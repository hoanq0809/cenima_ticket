package cybersoft.java12.cenima_ticket.ve.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;
import cybersoft.java12.cenima_ticket.ve.entity.Ve;

public class DatVeDto {
	@NotBlank(message = "{ve.maLichChieu.not-blank}")
	private long maLichChieu;
	@NotBlank(message = "{ve.danhSachVe.not-blank}")
	private List<Ve> danhSachVe;
	@NotBlank(message ="{ve.taiKhoanNguoiDung.not-blank}")
	private NguoiDung taiKhoanNguoiDung;
	public long getMaLichChieu() {
		return maLichChieu;
	}
	public void setMaLichChieu(long maLichChieu) {
		this.maLichChieu = maLichChieu;
	}
	public List<Ve> getDanhSachVe() {
		return danhSachVe;
	}
	public void setDanhSachVe(List<Ve> danhSachVe) {
		this.danhSachVe = danhSachVe;
	}
	public NguoiDung getTaiKhoanNguoiDung() {
		return taiKhoanNguoiDung;
	}
	public void setTaiKhoanNguoiDung(NguoiDung taiKhoanNguoiDung) {
		this.taiKhoanNguoiDung = taiKhoanNguoiDung;
	}
	
}
