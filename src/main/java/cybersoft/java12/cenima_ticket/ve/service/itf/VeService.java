package cybersoft.java12.cenima_ticket.ve.service.itf;

import java.util.List;

import javax.validation.Valid;

import cybersoft.java12.cenima_ticket.ve.dto.LayDanhSachPhongVeDto;
import cybersoft.java12.cenima_ticket.ve.entity.Ve;

public interface VeService {

	List<LayDanhSachPhongVeDto> layDanhSachVe( Long maLichChieu);
	
}
