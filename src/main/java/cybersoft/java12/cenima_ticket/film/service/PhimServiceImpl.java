package cybersoft.java12.cenima_ticket.film.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.film.dto.CreatePhimDto;
import cybersoft.java12.cenima_ticket.film.entity.Phim;
import cybersoft.java12.cenima_ticket.film.repository.PhimRepository;
import cybersoft.java12.cenima_ticket.film.service.itf.PhimService;

@Service
public class PhimServiceImpl implements PhimService {
	private PhimRepository repository;

	public PhimServiceImpl(PhimRepository phimRepository) {
		repository = phimRepository;
	}
	
	@Override
	public Phim themPhim(@Valid CreatePhimDto dto) {
		Phim phim = new Phim();
		phim.setTenPhim(dto.getTenPhim());
		phim.setBiDanh(dto.getBiDanh());
		phim.setMoTa(dto.getMoTa());
		phim.setTrailer(dto.getTrailer());
		phim.setNgayKhoiChieu(dto.getNgayKhoiChieu());
		
		return repository.save(phim);
		
		
	}

}
