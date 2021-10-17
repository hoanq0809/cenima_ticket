package cybersoft.java12.cenima_ticket.QuanLyRap.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.cenima_ticket.QuanLyRap.service.itf.CumRapService;

@RestController
@RequestMapping("api/QuanLyCumRap")
public class CumRapController {
	private CumRapService service;
	public CumRapController(CumRapService cumRapService) {
		service = cumRapService;
	}

	
}
