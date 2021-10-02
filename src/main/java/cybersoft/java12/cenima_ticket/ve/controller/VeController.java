package cybersoft.java12.cenima_ticket.ve.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.java12.cenima_ticket.common.ResponseHandler;
import cybersoft.java12.cenima_ticket.ve.dto.DatVeDto;
import cybersoft.java12.cenima_ticket.ve.dto.LayDanhSachPhongVeDto;
import cybersoft.java12.cenima_ticket.ve.entity.Ve;
import cybersoft.java12.cenima_ticket.ve.service.itf.VeService;

@RestController
@RequestMapping("/api/QuanLyDatVe")
public class VeController {
	private VeService service;
	public VeController(VeService veService) {
		// TODO Auto-generated constructor stub
		this.service=veService;
	}
	@PostMapping("/DatVe")
	public Object datVe(DatVeDto dto) {
		
		return null;
	}
	@GetMapping("/LayDanhSachPhongVe")
	public Object layDanhSachPhongVe(Long maLichChieu) {
		
		
		List<LayDanhSachPhongVeDto> lstVe= service.layDanhSachVe(maLichChieu);
		if(lstVe.isEmpty())
			return ResponseHandler.getResponse("mã lịch chiếu không tồn tại", HttpStatus.BAD_REQUEST);
		
		return ResponseHandler.getResponse(lstVe, HttpStatus.OK);
	}
}
