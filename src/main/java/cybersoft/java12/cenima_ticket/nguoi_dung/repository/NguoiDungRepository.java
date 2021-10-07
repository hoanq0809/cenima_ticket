package cybersoft.java12.cenima_ticket.nguoi_dung.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cybersoft.java12.cenima_ticket.nguoi_dung.dto.LayThongTinTaiKhoanDto;
import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;

@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung, Long> {
	
	@Query("SELECT u.taiKhoan as taiKhoan, u.matKhau as matKhau, u.hoTen as hoTen, u.email as email,"
			+ "u.soDienThoai as soDienthoai, u.loaiNguoiDung as loaiNguoiDung,"
			+ "v.id as id, v.giaVe as giaVe"		
			+ " FROM NguoiDung u  JOIN u.ve v ON u.id = v.nguoiDung.id WHERE u.taiKhoan = ?1")
	List<LayThongTinTaiKhoanDto> getNguoidungByTaiKhoan(String taiKhoan);
	
}
