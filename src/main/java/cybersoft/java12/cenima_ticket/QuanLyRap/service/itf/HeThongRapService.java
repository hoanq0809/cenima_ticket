package cybersoft.java12.cenima_ticket.QuanLyRap.service.itf;

import java.util.List;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.HeThongRapDto;

//abstraction
public interface HeThongRapService {
	//contract
	List<HeThongRapDto> findAll();
}
