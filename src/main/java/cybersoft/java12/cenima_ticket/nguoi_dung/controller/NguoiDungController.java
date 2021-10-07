package cybersoft.java12.cenima_ticket.nguoi_dung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.cenima_ticket.common.ResponseHandler;
import cybersoft.java12.cenima_ticket.nguoi_dung.dto.LayThongTinTaiKhoanDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.dto.ThongTinTaiKhoanDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.service.itf.NguoiDungService;

@RestController
@RequestMapping("/api/QuanLyNguoiDung")
public class NguoiDungController {
	
	private NguoiDungService service;
	
	
	public NguoiDungController(NguoiDungService nguoiDungService) {
		service = nguoiDungService;
	}


	@PostMapping("/ThongTinTaiKhoan")
	public Object LayThonTinTaiKhoan( @Valid @RequestBody ThongTinTaiKhoanDto dto, BindingResult errors ) {
		if(errors.hasErrors())
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		List<LayThongTinTaiKhoanDto> taiKhoan =  service.getThongTinTaiKhoan(dto);
		return ResponseHandler.getResponse(taiKhoan, HttpStatus.OK);
	}
}
