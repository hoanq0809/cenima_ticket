package cybersoft.java12.cenima_ticket.QuanLyRap.service.itf;

import java.util.List;

import javax.validation.Valid;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateCumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.CumRap;

//abstraction
public interface CumRapService {
	//contract
	List<CumRapDto> findAllDto();

	CumRap addNewCumRap(CreateCumRapDto dto);
	
}
