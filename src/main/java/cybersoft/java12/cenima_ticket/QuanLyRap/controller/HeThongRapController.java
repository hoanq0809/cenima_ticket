package cybersoft.java12.cenima_ticket.QuanLyRap.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateHeThongRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.HeThongRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.HeThongRap;
import cybersoft.java12.cenima_ticket.QuanLyRap.service.itf.HeThongRapService;
import cybersoft.java12.cenima_ticket.common.ResponseHandler;

@RestController
@RequestMapping("/api/QuanLyHeThongRap")
public class HeThongRapController {
	private HeThongRapService service;
	public HeThongRapController(HeThongRapService heThongRapService) {
		service = heThongRapService;
	}

	@GetMapping("/LayThongTinTatCaHeThongRap")
	public Object findAllHeThongRap() {
		List<HeThongRapDto> ListHeThongRap = service.findAll();
		return ResponseHandler.getResponse(ListHeThongRap, HttpStatus.OK);
	}
	
	@PostMapping
	public Object addHeThongRap(@Valid @RequestBody CreateHeThongRapDto dto, BindingResult errors) {
		if (errors.hasErrors()) {
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		}
		HeThongRap addedHeThongRap = service.addNewHeThongRap(dto);
		return ResponseHandler.getResponse(addedHeThongRap, HttpStatus.OK);
	}
}
