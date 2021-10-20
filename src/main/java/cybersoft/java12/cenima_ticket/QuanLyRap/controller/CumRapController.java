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

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateCumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.CumRap;
import cybersoft.java12.cenima_ticket.QuanLyRap.service.itf.CumRapService;
import cybersoft.java12.cenima_ticket.common.ResponseHandler;

@RestController
@RequestMapping("/api/QuanLyCumRap")
public class CumRapController {
	private CumRapService service;
	public CumRapController(CumRapService cumRapService) {
		service = cumRapService;
	}
	
	@GetMapping("/LayThongTinTatCaCumRap")
	public Object findAllCumRap() {
		List<CumRapDto> ListCumRap = service.findAllDto();
		return ResponseHandler.getResponse(ListCumRap, HttpStatus.OK);
	}
	
	@PostMapping("/admin/themCumRap")
	public Object addCumRap(@Valid @RequestBody CreateCumRapDto dto, BindingResult errors) {
		if (errors.hasErrors()) {
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		}
		CumRap addedCumRap = service.addNewCumRap(dto);
		return ResponseHandler.getResponse(addedCumRap, HttpStatus.OK);
	}
	
}
