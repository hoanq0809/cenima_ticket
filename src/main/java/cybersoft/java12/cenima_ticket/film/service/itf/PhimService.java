package cybersoft.java12.cenima_ticket.film.service.itf;

import javax.validation.Valid;

import cybersoft.java12.cenima_ticket.film.dto.CreatePhimDto;
import cybersoft.java12.cenima_ticket.film.entity.Phim;

public interface PhimService {

	Phim themPhim(@Valid CreatePhimDto dto);

}
