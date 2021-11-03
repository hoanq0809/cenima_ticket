package cybersoft.java12.cenima_ticket.QuanLyRap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.RapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.Rap;
import cybersoft.java12.cenima_ticket.QuanLyRap.repository.RapRepository;
import cybersoft.java12.cenima_ticket.QuanLyRap.service.itf.RapService;

@Service
public class RapServiceImpl implements RapService {
	private RapRepository repository;
	public RapServiceImpl(RapRepository rapRepository) {
		repository = rapRepository;
	}
	@Override
	public List<RapDto> findAllDto() {
		return repository.findAllDto();
	}
	@Override
	public Rap addNewRap(CreateRapDto dto) {
		Rap newRap = new Rap();
		
		newRap.setTenRap(dto.getTenRap());
		
		return repository.save(newRap);
	}
	@Override
	public void deleteById(Long rapId) {
		repository.deleteById(rapId);
	}
	@Override
	public Optional<Rap> findRapById(Long rapId) {
		 return repository.findById(rapId);	
	}

}
