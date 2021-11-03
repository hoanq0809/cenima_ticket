package cybersoft.java12.cenima_ticket.film.service;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.film.dto.CreatePhimDto;
import cybersoft.java12.cenima_ticket.film.dto.PhimDto;
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
		phim.setTheLoai(dto.getTheLoai());
		
		return repository.save(phim);
		
		
	}

	@Override
	public List<PhimDto> findAll() {
		return repository.findAllDto();
	}

	@Override
	public List<PhimDto> findAllDate(Date tuNgay, Date denNgay) {
		return repository.findAllDate(tuNgay, denNgay);
	}

}
