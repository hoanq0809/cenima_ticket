package cybersoft.java12.cenima_ticket.nguoi_dung.dto;

import java.util.Set;

public interface LayThongTinDatVeDto {
	public Long getId();
	public String getNgayDat();
	public int getGiaVe();
	public LayThongTinPhimDto getThuocPhim();
	public Set<LayThongTinGheDto> getGhe();
}
