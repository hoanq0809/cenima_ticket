package cybersoft.java12.cenima_ticket.QuanLyRap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.HeThongRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.repository.HeThongRapRepository;
import cybersoft.java12.cenima_ticket.QuanLyRap.service.itf.HeThongRapService;

@Service
public class HeThongRapServiceImpl implements HeThongRapService {
	private HeThongRapRepository repository;
	private HeThongRapServiceImpl(HeThongRapRepository heThongRapRepository) {
		repository = heThongRapRepository;
	}
	
	@Override
	public List<HeThongRapDto> findAll() {
		return repository.findAllDto();
	}

}
