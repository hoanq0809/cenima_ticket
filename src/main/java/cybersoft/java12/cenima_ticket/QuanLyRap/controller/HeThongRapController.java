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

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateHeThongRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.HeThongRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.LayCumRapTheoHeThongDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.HeThongRap;
import cybersoft.java12.cenima_ticket.QuanLyRap.service.itf.HeThongRapService;
import cybersoft.java12.cenima_ticket.common.ResponseHandler;

@RestController
@RequestMapping("/api/QuanLyRap")
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
	
	@GetMapping("/LayThongTinHeThongRapTheoId/{heThongRap-Id}")
	public Object findHeThongRapById(@PathVariable("heThongRap-Id") Long heThongRapId) {
		Optional<HeThongRap> heThongRapTheoId = service.findHeThongRapById(heThongRapId);
		return ResponseHandler.getResponse(heThongRapTheoId, HttpStatus.OK);
	}

	
	@PostMapping("/admin/themHeThongRap")
	public Object addHeThongRap(@Valid @RequestBody CreateHeThongRapDto dto, BindingResult errors) {
		if (errors.hasErrors()) {
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		}
		HeThongRap addedHeThongRap = service.addNewHeThongRap(dto);
		return ResponseHandler.getResponse(addedHeThongRap, HttpStatus.OK);
	}
	@DeleteMapping("/admin/xoaHeThongRap/{heThongRap-id}")
	public Object deleteHeThongRap(@PathVariable("heThongRap-id") Long heThongRapId) {
		service.deleteById(heThongRapId);
		
		return ResponseHandler.getResponse(HttpStatus.OK);
	}
	
	
	@GetMapping("/LayThongTinCumRapTheoHeThong/{heThongRap-maHeThong}")
	public Object getCumRapTheoHeThong(@PathVariable("heThongRap-maHeThong") String maHeThong) {
		List<LayCumRapTheoHeThongDto> cumRap = service.findByMaHeThong(maHeThong);
		return ResponseHandler.getResponse(cumRap, HttpStatus.OK);
	}
}
