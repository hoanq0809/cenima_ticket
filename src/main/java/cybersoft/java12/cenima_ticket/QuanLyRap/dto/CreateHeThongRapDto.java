package cybersoft.java12.cenima_ticket.QuanLyRap.dto;

import javax.validation.constraints.NotBlank;

public class CreateHeThongRapDto {
	@NotBlank
	private String name;
	@NotBlank
	private String maHeThong;
	@NotBlank
	private String biDanh;
	@NotBlank
	private String linkImageLogo;
	/*getter and setter*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaHeThong() {
		return maHeThong;
	}
	public void setMaHeThong(String maHeThong) {
		this.maHeThong = maHeThong;
	}
	public String getBiDanh() {
		return biDanh;
	}
	public void setBiDanh(String biDanh) {
		this.biDanh = biDanh;
	}
	public String getLinkImageLogo() {
		return linkImageLogo;
	}
	public void setLinkImageLogo(String linkImageLogo) {
		this.linkImageLogo = linkImageLogo;
	}
}
