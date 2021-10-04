package cybersoft.java12.cenima_ticket.ve.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import cybersoft.java12.cenima_ticket.ve.dto.LayDanhSachPhongVeDto;
import cybersoft.java12.cenima_ticket.ve.entity.Ve;
import cybersoft.java12.cenima_ticket.ve.repository.VeRepository;
import cybersoft.java12.cenima_ticket.ve.service.itf.VeService;
@Service
public class VeServiceImpl implements VeService {
	private   VeRepository repository;
	public VeServiceImpl(VeRepository veRepository) {
		repository = veRepository;
	
	}
	
	@Override
	public List<LayDanhSachPhongVeDto> layDanhSachVe(Long maLichChieu) {
			
		
		
		return repository.findAllVeByLichChieuId( maLichChieu);
		
			
	}
		
}
