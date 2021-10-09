package cybersoft.java12.cenima_ticket.nguoi_dung.dto;


import java.util.Set;

import cybersoft.java12.cenima_ticket.ve.dto.LayDanhSachPhongVeDto;

public interface LayThongTinTaiKhoanDto {
	public String getTaiKhoan();
	public String getMatKhau();
	public String getHoTen();
	public String getEmail();
	public String getSoDienThoai();
	public String getLoaiNguoiDung();
	public Set<LayDanhSachPhongVeDto> getVe();
}
