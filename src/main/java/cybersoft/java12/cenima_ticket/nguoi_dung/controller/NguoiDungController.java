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

@RestController
@RequestMapping("/api/QuanLyNguoiDung")
public class NguoiDungController {
	public NguoiDungController() {
		// TODO Auto-generated constructor stub
	}
	@PostMapping("/DangKy")
	public Object dangKy(@Valid @RequestBody DangKyDto dto,BindingResult errs) {
		if(errs.hasErrors())
			return ResponseHandler.getResponse(errs, HttpStatus.BAD_REQUEST);
			
		
		
		return null;
	}
}
