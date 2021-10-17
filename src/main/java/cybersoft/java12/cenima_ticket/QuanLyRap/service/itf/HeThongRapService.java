package cybersoft.java12.cenima_ticket.QuanLyRap.service.itf;

import java.util.List;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CreateHeThongRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.HeThongRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.HeThongRap;

//abstraction
public interface HeThongRapService {
	//contract
	List<HeThongRapDto> findAll();

	HeThongRap addNewHeThongRap(CreateHeThongRapDto dto);
}
