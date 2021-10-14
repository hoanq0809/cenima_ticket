package cybersoft.java12.cenima_ticket.security.Dto;

import javax.validation.constraints.NotBlank;

public class LoginDto {
	@NotBlank(message = "{login.username.not-blank}")
	private String taiKhoan;
	@NotBlank(message = "{login.username.not-blank}")
	private String matKhau;
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	
}
