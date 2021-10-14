package cybersoft.java12.cenima_ticket.security.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.cenima_ticket.common.ResponseHandler;
import cybersoft.java12.cenima_ticket.security.Dto.LoginDto;
import cybersoft.java12.cenima_ticket.security.jwt.JwtUtils;
import io.jsonwebtoken.Jwts;

@RestController
@RequestMapping("/api/QuanLyNguoiDung")
public class AuthController {
	private static final Logger logger = LoggerFactory.getLogger(Jwts.class);
	private final AuthenticationManager authenticationManager;
	private final JwtUtils jwtUtils; 
	public AuthController(AuthenticationManager authenticationManager,JwtUtils jwtUtils) {
		// TODO Auto-generated constructor stub
		this.authenticationManager=authenticationManager;
		this.jwtUtils=jwtUtils;
	}
	@PostMapping("/DangNhap")
	public Object login(@Valid @RequestBody LoginDto dto,BindingResult errs) {
		if(errs.hasErrors())
			return ResponseHandler.getResponse(errs, HttpStatus.BAD_REQUEST);
		Authentication auth=null;
		try {
			auth=authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(dto.getTaiKhoan(), dto.getMatKhau())
					);
			SecurityContextHolder.getContext().setAuthentication(auth);
			String token = jwtUtils.generateJwtToken(auth);
			// log history - AOP
			return ResponseHandler.getResponse(token, HttpStatus.OK);
		} catch (Exception e) {
			logger.debug("{} has been logged in with wrong password: {}",dto.getTaiKhoan(), e.getMessage() );
		}
		return ResponseHandler.getResponse("Tài khoản hoặc mật khẩu không đúng", HttpStatus.BAD_REQUEST);
		
	}
}
