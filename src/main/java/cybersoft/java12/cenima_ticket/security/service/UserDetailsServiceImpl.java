package cybersoft.java12.cenima_ticket.security.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;

import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;
import cybersoft.java12.cenima_ticket.nguoi_dung.repository.UserRepository;
import cybersoft.java12.cenima_ticket.security.dto.UserDetailsDto;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	private UserRepository repository;
	public UserDetailsServiceImpl( UserRepository userRepository ) {
		repository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String taiKhoan) throws UsernameNotFoundException {
		Optional<NguoiDung> nguoiDung = repository.findByTaiKhoan(taiKhoan);
		if(!nguoiDung.isPresent())
			throw new UsernameNotFoundException("Username is not existed.");
		
		Set<GrantedAuthority> authorities = getAuthorities(nguoiDung.get().getLoaiNguoiDung());
		return new UserDetailsDto(taiKhoan, nguoiDung.get().getMatKhau(), authorities);
	}

	private Set<GrantedAuthority> getAuthorities(String loaiNguoiDung) {
		Set<GrantedAuthority> authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority(loaiNguoiDung));
		return authorities;
	}

}
