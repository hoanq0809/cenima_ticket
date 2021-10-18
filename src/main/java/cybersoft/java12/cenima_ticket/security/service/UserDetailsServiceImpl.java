package cybersoft.java12.cenima_ticket.security.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;
import cybersoft.java12.cenima_ticket.nguoi_dung.repository.UserRepository;
import cybersoft.java12.cenima_ticket.security.Dto.UserDetailsDto;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	private UserRepository repository;
	public UserDetailsServiceImpl(UserRepository userRepository) {
		repository=userRepository;
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<NguoiDung> user=repository.findByTaiKhoan(username);
		if(!user.isPresent())
			throw new UsernameNotFoundException("Username is not existed.");
		Set<GrantedAuthority> authorities = getAuthorities(user.get().getLoaiNguoiDung());
		return new UserDetailsDto(username, user.get().getMatKhau(), authorities);
		
	}
	private Set<GrantedAuthority> getAuthorities(String loaiNguoiDung) {
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(loaiNguoiDung));
		return authorities;
	}
	
	
	

}
