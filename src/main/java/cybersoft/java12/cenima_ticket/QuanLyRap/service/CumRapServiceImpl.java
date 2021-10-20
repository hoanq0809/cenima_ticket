package cybersoft.java12.cenima_ticket.QuanLyRap.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateCumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.CumRap;
import cybersoft.java12.cenima_ticket.QuanLyRap.repository.CumRapRepository;
import cybersoft.java12.cenima_ticket.QuanLyRap.service.itf.CumRapService;

@Service
public class CumRapServiceImpl implements CumRapService {
	private CumRapRepository repository;
	private CumRapServiceImpl(CumRapRepository cumRapRepository) {
		repository = cumRapRepository;
	}

	@Override
	public List<CumRapDto> findAllDto() {	
		return repository.findAllDto();
	}

	@Override
	public CumRap addNewCumRap(CreateCumRapDto dto) {
		CumRap newCumRap = new CumRap();
		
		newCumRap.setTenCumRap(dto.getTenCumRap());
		newCumRap.setMaCumRap(dto.getMaCumRap());
		newCumRap.setDiaChi(dto.getDiaChi());
		
		return repository.save(newCumRap);
	}

}
