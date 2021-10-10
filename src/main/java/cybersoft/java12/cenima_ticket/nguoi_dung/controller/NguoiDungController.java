package cybersoft.java12.cenima_ticket.nguoi_dung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.cenima_ticket.common.ResponseHandler;
import cybersoft.java12.cenima_ticket.nguoi_dung.dto.LayThongTinTaiKhoanDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.dto.ThemNguoiDungDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.dto.ThongTinTaiKhoanDto;

import cybersoft.java12.cenima_ticket.nguoi_dung.dto.DangKyDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;
import cybersoft.java12.cenima_ticket.nguoi_dung.service.itf.UserService;

@RestController
@RequestMapping("/api/QuanLyNguoiDung")
public class NguoiDungController {
	private UserService service;
	public NguoiDungController(UserService userService) {
		// TODO Auto-generated constructor stub
		service=userService;
	}
	@PostMapping("/DangKy")
	public Object dangKy(@Valid @RequestBody DangKyDto dto,BindingResult errs) {
		if(errs.hasErrors())
			return ResponseHandler.getResponse(errs, HttpStatus.BAD_REQUEST);
		
		NguoiDung user= service.createUser(dto);
		
		
		return ResponseHandler.getResponse("success", HttpStatus.OK);
	}

	@PostMapping("/ThongTinTaiKhoan")
	public Object LayThonTinTaiKhoan( @Valid @RequestBody ThongTinTaiKhoanDto dto, BindingResult errors ) {
		if(errors.hasErrors())
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		List<LayThongTinTaiKhoanDto> taiKhoan =  service.getThongTinTaiKhoan(dto);
		return ResponseHandler.getResponse(taiKhoan, HttpStatus.OK);
	}
	
	@PostMapping("/ThemNguoiDung")
	public Object ThemNguoiDung(@Valid @RequestBody ThemNguoiDungDto dto, BindingResult errors) {
		if(errors.hasErrors())
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		NguoiDung nguoiDung = service.themNguoiDung(dto);
		return ResponseHandler.getResponse(nguoiDung, HttpStatus.OK);
	}
}
