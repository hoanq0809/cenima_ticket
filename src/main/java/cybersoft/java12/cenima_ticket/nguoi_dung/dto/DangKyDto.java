package cybersoft.java12.cenima_ticket.nguoi_dung.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import cybersoft.java12.cenima_ticket.nguoi_dung.validation.anotation.UniqueEmail;
import cybersoft.java12.cenima_ticket.nguoi_dung.validation.anotation.UniqueUsername;

public class DangKyDto {
	@NotBlank(message = "{user.username.not-blank}")
	@UniqueUsername(message = "{user.username.not-unique}")
	private String taiKhoan;
	@NotBlank(message ="{user.password.not-blank}")
	private String matKhau;
	@NotBlank(message ="{user.email.not-blank}")
	@UniqueEmail
	@Email(message = "{user.email.not-valid}")
	private String email;
	private String soDt;
	@NotBlank(message ="{user.maLoaiNguoiDung.not-blank}")
	private String maLoaiNguoiDung;
	@NotBlank(message ="{user.hoTen.not-blank}")
	private String hoTen;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoDt() {
		return soDt;
	}
	public void setSoDt(String soDt) {
		this.soDt = soDt;
	}
	public String getMaLoaiNguoiDung() {
		return maLoaiNguoiDung;
	}
	public void setMaLoaiNguoiDung(String maLoaiNguoiDung) {
		this.maLoaiNguoiDung = maLoaiNguoiDung;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
}
