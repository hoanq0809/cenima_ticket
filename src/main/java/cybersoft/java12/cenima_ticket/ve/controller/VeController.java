package cybersoft.java12.cenima_ticket.ve.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.cenima_ticket.ve.dto.DatVeDto;
import cybersoft.java12.cenima_ticket.ve.service.itf.VeService;

@RestController
@RequestMapping("/api/ve")
public class VeController {
	private VeService service;
	@PostMapping
	public Object datVe(DatVeDto dto) {
		
		return null;
	}
}
