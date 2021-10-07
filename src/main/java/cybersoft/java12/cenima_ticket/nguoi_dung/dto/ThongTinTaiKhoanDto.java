package cybersoft.java12.cenima_ticket.nguoi_dung.dto;

import javax.validation.constraints.NotBlank;

public class ThongTinTaiKhoanDto {
	
	@NotBlank
	public String taiKhoan;

	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	
}
