package cybersoft.java12.cenima_ticket.QuanLyRap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.HeThongRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.dto.LayCumRapTheoHeThongDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.HeThongRap;

@Repository
public interface HeThongRapRepository extends JpaRepository<HeThongRap, Long> {
	
	@Transactional(readOnly = true)
	@Query("SELECT htr FROM HeThongRap htr")
	List<HeThongRapDto> findAllDto();

	@Query("SELECT htr FROM HeThongRap htr JOIN htr.cumRap r WHERE htr.id = ?1")
	List<LayCumRapTheoHeThongDto> findByHeThongRap(Long maHeThongRap);

}
