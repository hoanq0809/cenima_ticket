package cybersoft.java12.cenima_ticket.nguoi_dung.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;

import cybersoft.java12.cenima_ticket.nguoi_dung.dto.LayThongTinTaiKhoanDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;
@Repository
public interface UserRepository extends JpaRepository<NguoiDung, Long> {

	int countByTaiKhoan(String username);

	int countByEmail(String lowerCase);
//	@EntityGraph( value = "graph.user.ve" )
	@Query("SELECT u FROM NguoiDung u "
			+ "JOIN u.ve v "
			+ "JOIN v.ghe g "
			+ "JOIN g.thuocRap r "
			+ "JOIN r.thuocCumRap cr "
			+ "JOIN cr.heThongRap ht "
			+ "JOIN v.thuocPhim p "
			+ "WHERE u.taiKhoan = ?1  ")
	
	List<LayThongTinTaiKhoanDto> getNguoidungByTaiKhoan(String taiKhoan);

	Optional<NguoiDung> findByTaiKhoan(String taiKhoan);

}
