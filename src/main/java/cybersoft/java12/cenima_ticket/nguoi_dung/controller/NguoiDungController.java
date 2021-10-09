package cybersoft.java12.cenima_ticket.nguoi_dung.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.cenima_ticket.common.ResponseHandler;
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
}
