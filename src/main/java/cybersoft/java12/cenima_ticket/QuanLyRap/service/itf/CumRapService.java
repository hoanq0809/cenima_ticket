package cybersoft.java12.cenima_ticket.QuanLyRap.service.itf;

import java.util.List;
import java.util.Optional;


import cybersoft.java12.cenima_ticket.QuanLyRap.dto.AddRapToCumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateCumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.CumRap;

//abstraction
public interface CumRapService {
	//contract
	List<CumRapDto> findAllDto();

	CumRap addNewCumRap(CreateCumRapDto dto);

	Optional<CumRap> findCumRapById(Long cumRapId);

	void deleteById(Long cumRapId);

	CumRap addRap(AddRapToCumRapDto dto);
	
}
