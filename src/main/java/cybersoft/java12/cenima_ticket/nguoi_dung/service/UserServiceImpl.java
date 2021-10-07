package cybersoft.java12.cenima_ticket.nguoi_dung.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.nguoi_dung.dto.DangKyDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;
import cybersoft.java12.cenima_ticket.nguoi_dung.repository.UserRepository;
import cybersoft.java12.cenima_ticket.nguoi_dung.service.itf.UserService;
@Service
public class UserServiceImpl implements UserService {
	private UserRepository repository;
	public UserServiceImpl(UserRepository userRepository) {	
	// TODO Auto-generated constructor stub
		repository=userRepository;
	}
	@Override
	public NguoiDung createUser( DangKyDto dto) {
		// TODO Auto-generated method stub
		
		NguoiDung user=new NguoiDung();
		
		user.setTaiKhoan(dto.getTaiKhoan());
		user.setHoTen(dto.getHoTen());
		user.setEmail(dto.getEmail());
		user.setMatKhau(dto.getMatKhau());
		user.setSoDienThoai(dto.getSoDt());
		user.setLoaiNguoiDung("KhachHang");
	   return repository.save(user);
	}
	@Override
	public boolean isTakenUsername(String username) {
		// TODO Auto-generated method stub
		return repository.countByTaiKhoan(username) >= 1;
	}
	@Override
	public boolean isTakenEmail(String email) {
		// TODO Auto-generated method stub
		return repository.countByEmail(email.toLowerCase())>=1;
	}
	
	
}
