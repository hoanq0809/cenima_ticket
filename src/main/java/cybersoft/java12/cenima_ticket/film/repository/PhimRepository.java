package cybersoft.java12.cenima_ticket.film.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cybersoft.java12.cenima_ticket.film.dto.PhimDto;
import cybersoft.java12.cenima_ticket.film.entity.Phim;

@Repository
public interface PhimRepository extends JpaRepository<Phim, Long> {
	@Transactional(readOnly = true)
	@Query("SELECT p FROM Phim p")
	List<PhimDto> findAllDto();
	@Transactional(readOnly = true)
	@Query("SELECT p FROM Phim p WHERE p.ngayKhoiChieu  BETWEEN :fDate AND :tDate  ")
	List<PhimDto> findAllDate(@Param("fDate") Date tuNgay,@Param("tDate")  Date denNgay);
	

}
