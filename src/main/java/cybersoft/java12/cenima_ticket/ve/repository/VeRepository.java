package cybersoft.java12.cenima_ticket.ve.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cybersoft.java12.cenima_ticket.ve.dto.LayDanhSachPhongVeDto;
import cybersoft.java12.cenima_ticket.ve.entity.Ve;
@Repository
public interface VeRepository extends JpaRepository<Ve,Long>  {
//	FROM Ve a LEFT JOIN LichChieu b LEFT JOIN Phim c WHERE b.id = ?1
//	SELECT p.tenPhim,v.soGhe,v.giaVe  FROM  Ve v , Phim p WHERE v.maLichChieu.id=?1 and p.id=v.thuocPhim.id 
	@Query("SELECT p.tenPhim as tenPhim, v.giaVe as giaVe, g.soGhe as soGhe FROM Ve v JOIN v.thuocPhim p "
			+ "LEFT JOIN v.ghe g WHERE v.maLichChieu.id = ?1 ")
	List<LayDanhSachPhongVeDto> findAllVeByLichChieuId( Long maLichChieu);
	
	
}
