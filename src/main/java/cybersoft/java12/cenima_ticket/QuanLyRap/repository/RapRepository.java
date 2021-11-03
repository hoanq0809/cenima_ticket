package cybersoft.java12.cenima_ticket.QuanLyRap.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cybersoft.java12.cenima_ticket.QuanLyRap.dto.RapDto;
import cybersoft.java12.cenima_ticket.QuanLyRap.entity.Rap;

@Repository
public interface RapRepository extends JpaRepository<Rap, Long> {
	
	@Transactional(readOnly = true)
	@Query("SELECT r FROM Rap r")
	List<RapDto> findAllDto();

}
