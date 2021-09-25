package cybersoft.java12.cenima_ticket.film.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.cenima_ticket.common.ResponseHandler;
import cybersoft.java12.cenima_ticket.film.dto.CreatePhimDto;
import cybersoft.java12.cenima_ticket.film.entity.Phim;
import cybersoft.java12.cenima_ticket.film.service.itf.PhimService;

@RestController
@RequestMapping("/api/QuanLyPhim")
public class PhimController {
	private PhimService service;
	public PhimController(PhimService phimService) {
		service = phimService;
	}
	
	@PostMapping("/ThemPhim")
	public Object themPhim(@Valid @RequestBody CreatePhimDto dto, BindingResult errors ) {
		if( errors.hasErrors() ) 
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		Phim themPhim = service.themPhim(dto);
		return ResponseHandler.getResponse(themPhim, HttpStatus.CREATED);
	}
}
