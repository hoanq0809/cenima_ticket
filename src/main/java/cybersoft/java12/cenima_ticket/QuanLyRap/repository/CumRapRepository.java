package cybersoft.java12.cenima_ticket.QuanLyRap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cybersoft.java12.cenima_ticket.QuanLyRap.entity.CumRap;

@Repository
public interface CumRapRepository extends JpaRepository<CumRap, Long> {

}
