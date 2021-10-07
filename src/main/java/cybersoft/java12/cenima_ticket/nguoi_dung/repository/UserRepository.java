package cybersoft.java12.cenima_ticket.nguoi_dung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;
@Repository
public interface UserRepository extends JpaRepository<NguoiDung, Long> {

}
