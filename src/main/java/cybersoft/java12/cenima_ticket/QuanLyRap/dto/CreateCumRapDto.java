package cybersoft.java12.cenima_ticket.QuanLyRap.dto;

import javax.validation.constraints.NotBlank;

public class CreateCumRapDto {
	@NotBlank
	private String tenCumRap;
	@NotBlank
	private String maCumRap;
	@NotBlank
	private String diaChi;
	
	/*getter and setter*/
	public String getTenCumRap() {
		return tenCumRap;
	}
	public void setTenCumRap(String tenCumRap) {
		this.tenCumRap = tenCumRap;
	}
	public String getMaCumRap() {
		return maCumRap;
	}
	public void setMaCumRap(String maCumRap) {
		this.maCumRap = maCumRap;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
}
