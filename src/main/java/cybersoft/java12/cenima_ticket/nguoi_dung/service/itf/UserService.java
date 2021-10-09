package cybersoft.java12.cenima_ticket.nguoi_dung.service.itf;

import javax.validation.Valid;

import cybersoft.java12.cenima_ticket.nguoi_dung.dto.DangKyDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;

public interface UserService {

	NguoiDung createUser( DangKyDto dto);

	boolean isTakenUsername(String username);

	boolean isTakenEmail(String email);

	

}
