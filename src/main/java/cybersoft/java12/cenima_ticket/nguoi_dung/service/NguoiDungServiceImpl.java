package cybersoft.java12.cenima_ticket.nguoi_dung.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.nguoi_dung.dto.LayThongTinTaiKhoanDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.dto.ThongTinTaiKhoanDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.repository.NguoiDungRepository;
import cybersoft.java12.cenima_ticket.nguoi_dung.service.itf.NguoiDungService;

@Service
public class NguoiDungServiceImpl implements NguoiDungService {
	private NguoiDungRepository repository;
	public NguoiDungServiceImpl( NguoiDungRepository nguoiDungRepository ) {
		repository = nguoiDungRepository;
	}
	
	@Override
	public List<LayThongTinTaiKhoanDto> getThongTinTaiKhoan(ThongTinTaiKhoanDto dto) {
		return repository.getNguoidungByTaiKhoan(dto.getTaiKhoan());
	}

}
