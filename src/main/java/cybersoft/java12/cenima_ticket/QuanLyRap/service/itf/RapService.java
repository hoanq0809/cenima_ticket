package cybersoft.java12.cenima_ticket.QuanLyRap.service.itf;

import java.util.List;


import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.RapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.Rap;

public interface RapService {

	List<RapDto> findAllDto();

	Rap addNewRap(CreateRapDto dto);

}
