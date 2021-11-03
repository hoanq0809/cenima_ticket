package cybersoft.java12.cenima_ticket.QuanLyRap.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.AddRapToCumRapDto;
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
	
	@GetMapping("/LayThongTinCumRapTheoId/{cumRap-id}")
	public Object findCumRapById(@PathVariable("cumRap-id") Long cumRapId) {
		Optional<CumRap> cumRapTheoId = service.findCumRapById(cumRapId);
		return ResponseHandler.getResponse(cumRapTheoId, HttpStatus.OK);
	}
	
	@PostMapping("/admin/themCumRap")
	public Object addCumRap(@Valid @RequestBody CreateCumRapDto dto, BindingResult errors) {
		if (errors.hasErrors()) {
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		}
		CumRap addedCumRap = service.addNewCumRap(dto);
		return ResponseHandler.getResponse(addedCumRap, HttpStatus.OK);
	}
	
	@PostMapping("/addRapToCumRap")
	public Object addRapToCumRap(@Valid @RequestBody AddRapToCumRapDto dto, BindingResult errors) {
		if(errors.hasErrors()) {
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		}		
		CumRap updateCumRap = service.addRap(dto);
		return ResponseHandler.getResponse(updateCumRap, HttpStatus.OK);	
	}
	
	@DeleteMapping("/admin/xoaCumRap/{cumRap-id}")
	public Object deleteCumRap(@PathVariable("cumRap-id") Long cumRapId) {
		service.deleteById(cumRapId);
		return ResponseHandler.getResponse(HttpStatus.OK);
	}
	
}
