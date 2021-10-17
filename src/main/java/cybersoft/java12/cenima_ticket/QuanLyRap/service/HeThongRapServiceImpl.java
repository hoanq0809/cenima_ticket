package cybersoft.java12.cenima_ticket.QuanLyRap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateHeThongRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.HeThongRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.LayCumRapTheoHeThongDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.HeThongRap;
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

	@Override
	public HeThongRap addNewHeThongRap(CreateHeThongRapDto dto) {
		HeThongRap newHeThongRap = new HeThongRap();
		
		newHeThongRap.setName(dto.getName());
		newHeThongRap.setMaHeThong(dto.getMaHeThong());
		newHeThongRap.setBiDanh(dto.getBiDanh());
		newHeThongRap.setLinkImage(dto.getLinkImageLogo());
		
		return repository.save(newHeThongRap);
	}

	@Override
	public List<LayCumRapTheoHeThongDto> findByHeThongRap(Long maHeThongRap) {
		return repository.findByHeThongRap(maHeThongRap);
	}

}
