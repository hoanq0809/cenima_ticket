package cybersoft.java12.cenima_ticket.film.service.itf;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import cybersoft.java12.cenima_ticket.film.dto.CreatePhimDto;
import cybersoft.java12.cenima_ticket.film.dto.PhimDto;
import cybersoft.java12.cenima_ticket.film.entity.Phim;

public interface PhimService {

	Phim themPhim(@Valid CreatePhimDto dto, String uploadAnh);

	List<PhimDto> findAll();

	List<PhimDto> findAllDate(Date tuNgay, Date denNgay);

}
