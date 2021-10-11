package cybersoft.java12.cenima_ticket.QuanLyRap.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.HeThongRapDto;
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
}
