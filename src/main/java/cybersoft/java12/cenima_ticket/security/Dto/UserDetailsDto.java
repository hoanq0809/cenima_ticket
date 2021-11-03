package cybersoft.java12.cenima_ticket.security.Dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsDto extends User implements UserDetails {
	public UserDetailsDto(String taiKhoan, String matKhau, Collection<? extends GrantedAuthority> authorities) {
		super(taiKhoan, matKhau, authorities);
	}
 
		
}
