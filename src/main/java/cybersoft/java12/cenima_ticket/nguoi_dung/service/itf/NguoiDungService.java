package cybersoft.java12.cenima_ticket.nguoi_dung.service.itf;

import java.util.List;

import javax.validation.Valid;

import cybersoft.java12.cenima_ticket.nguoi_dung.dto.LayThongTinTaiKhoanDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.dto.ThongTinTaiKhoanDto;

public interface NguoiDungService {

	List<LayThongTinTaiKhoanDto> getThongTinTaiKhoan(ThongTinTaiKhoanDto dto);

}
