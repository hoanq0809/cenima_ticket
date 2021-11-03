package cybersoft.java12.cenima_ticket.QuanLyRap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.CumRapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.CumRap;

@Repository
public interface CumRapRepository extends JpaRepository<CumRap, Long> {

	@Transactional(readOnly = true)
	@Query("SELECT cr FROM CumRap cr")
	List<CumRapDto> findAllDto();

}
