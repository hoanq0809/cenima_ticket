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

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.RapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.Rap;
import cybersoft.java12.cenima_ticket.QuanLyRap.service.itf.RapService;
import cybersoft.java12.cenima_ticket.common.ResponseHandler;

@RestController
@RequestMapping("/api/QuanLyRap")
public class RapController {
	private RapService service;
	public RapController(RapService rapService) {
		service = rapService;
	}
	
	@GetMapping("/LayThongTinTatCaRap")
	public Object findAllRap(){
		List<RapDto> ListRap = service.findAllDto();
		return ResponseHandler.getResponse(ListRap, HttpStatus.OK);
	}
	
	@GetMapping("/admin/LayThonTinRapTheoId/{rap-id}")
	public Object findRapById(@PathVariable("rap-id") Long rapId) {
		Optional<Rap> RapTheoId = service.findRapById(rapId);
		return ResponseHandler.getResponse(RapTheoId, HttpStatus.OK);
	}
	
	@PostMapping("/admin/themRap")
	public Object addRap(@Valid @RequestBody CreateRapDto dto, BindingResult errors) {
		if(errors.hasErrors()) {
			return ResponseHandler.getResponse(errors, HttpStatus.BAD_REQUEST);
		}
		Rap addedRap = service.addNewRap(dto);
		return ResponseHandler.getResponse(addedRap, HttpStatus.OK);
	}
	@DeleteMapping("/admin/xoaRap/{rap-id}")
	public Object deleteRap(@PathVariable("rap-id") Long rapId) {
		service.deleteById(rapId);
		return ResponseHandler.getResponse(HttpStatus.OK);
	}
}
