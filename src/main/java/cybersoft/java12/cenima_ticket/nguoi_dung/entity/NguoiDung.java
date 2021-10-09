package cybersoft.java12.cenima_ticket.nguoi_dung.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;
import cybersoft.java12.cenima_ticket.ve.entity.Ve;

@Entity
@Table(name = "eticket_nguoi_dung")
public class NguoiDung extends BaseEntity {
	@NotNull
	@Column(name = "hoTen")
	@Size(min = 3, max = 50)
	private String hoTen;
	@NotNull
	@Column(name="taiKhoan",unique = true)
	private String taiKhoan;
	@NotNull
	@Email
	@Column(name = "email", unique = true)
	private String email;
	
	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	@NotNull
	@Column(name = "matKhau")
	private String matKhau;
	
	@Column(name = "soDienThoai")
	private String soDienThoai;
	
	@Column(name = "avatar")
	private String avatar;
	
	@Column(name = "ngaySinh")
	private Date ngaySinh;
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getLoaiNguoiDung() {
		return loaiNguoiDung;
	}

	public void setLoaiNguoiDung(String loaiNguoiDung) {
		this.loaiNguoiDung = loaiNguoiDung;
	}

	public Set<Ve> getVe() {
		return ve;
	}

	public void setVe(Set<Ve> ve) {
		this.ve = ve;
	}

	@Column(name = "loaiNguoiDung")
	private String loaiNguoiDung;
	
	@OneToMany(mappedBy = "nguoiDung", fetch = FetchType.LAZY)
	private Set<Ve> ve = new HashSet<>();
	
}
