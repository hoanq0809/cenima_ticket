package cybersoft.java12.cenima_ticket.QuanLyRap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.AddRapToCumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateCumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.CumRap;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.Rap;
import cybersoft.java12.cenima_ticket.QuanLyRap.repository.CumRapRepository;
import cybersoft.java12.cenima_ticket.QuanLyRap.repository.RapRepository;
import cybersoft.java12.cenima_ticket.QuanLyRap.service.itf.CumRapService;

@Service
public class CumRapServiceImpl implements CumRapService {
	private CumRapRepository repository;
	private RapRepository rapRepository;
	private CumRapServiceImpl(CumRapRepository cumRapRepository,
			RapRepository rapRepository) {
		repository = cumRapRepository;
		this.rapRepository = rapRepository;
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

	@Override
	public Optional<CumRap> findCumRapById(Long cumRapId) {
		return repository.findById(cumRapId);
	}

	@Override
	public void deleteById(Long cumRapId) {
		repository.deleteById(cumRapId);
		
	}

	@Override
	public CumRap addRap(AddRapToCumRapDto dto) {
		Rap rap = rapRepository.getById(dto.getRapId());
		CumRap cumRap = repository.getById(dto.getCumRapId());
		
		cumRap.addRap(rap);
		
		return repository.save(cumRap);
	}



}
