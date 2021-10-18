package cybersoft.java12.cenima_ticket.nguoi_dung.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;
@Repository
public interface UserRepository extends JpaRepository<NguoiDung, Long> {

	int countByTaiKhoan(String username);

	int countByEmail(String lowerCase);
	@Query("SELECT nd FROM NguoiDung nd WHERE nd.taiKhoan=?1")
	
	NguoiDung findByTaiKhoan(String username);

}
