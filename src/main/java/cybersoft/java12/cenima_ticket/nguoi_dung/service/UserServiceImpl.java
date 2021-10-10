package cybersoft.java12.cenima_ticket.nguoi_dung.service;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.nguoi_dung.dto.DangKyDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.dto.LayThongTinTaiKhoanDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.dto.ThemNguoiDungDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.dto.ThongTinTaiKhoanDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;
import cybersoft.java12.cenima_ticket.nguoi_dung.repository.UserRepository;
import cybersoft.java12.cenima_ticket.nguoi_dung.service.itf.UserService;
@Service
public class UserServiceImpl implements UserService {
	private UserRepository repository;
	private PasswordEncoder encoder;
	public UserServiceImpl(UserRepository userRepository,PasswordEncoder passwordEncoder) {
	// TODO Auto-generated constructor stub
		repository=userRepository;
		encoder=passwordEncoder;
	}
	@Override
	public NguoiDung createUser( DangKyDto dto) {
		// TODO Auto-generated method stub
		
		NguoiDung user=new NguoiDung();
		
		user.setTaiKhoan(dto.getTaiKhoan());
		user.setHoTen(dto.getHoTen());
		user.setEmail(dto.getEmail());
		user.setMatKhau( encoder.encode(dto.getMatKhau()) );
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
	@Override
	public List<LayThongTinTaiKhoanDto> getThongTinTaiKhoan(ThongTinTaiKhoanDto dto) {
		return repository.getNguoidungByTaiKhoan(dto.getTaiKhoan());
	}
	@Override
	public NguoiDung themNguoiDung(ThemNguoiDungDto dto) {
		NguoiDung addNguoiDung = new NguoiDung();
		addNguoiDung.setTaiKhoan(dto.getTaiKhoan());
		addNguoiDung.setHoTen(dto.getHoTen());
		addNguoiDung.setEmail(dto.getEmail());
		addNguoiDung.setMatKhau( encoder.encode(dto.getMatKhau()) );
		addNguoiDung.setSoDienThoai(dto.getSoDt());
		addNguoiDung.setLoaiNguoiDung("KhachHang");
		return repository.save(addNguoiDung);
	}
	
	
}
