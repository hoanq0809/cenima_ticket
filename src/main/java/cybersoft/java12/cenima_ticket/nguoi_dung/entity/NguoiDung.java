package cybersoft.java12.cenima_ticket.nguoi_dung.entity;

import java.util.Date;
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
	@Column(name = "hoTen",unique = true)
	@Size(min = 3, max = 50)
	private String hoTen;
	
	@NotNull
	@Email
	@Column(name = "email", unique = true)
	private String email;
	
	@NotNull
	@Column(name = "matKhau")
	private String matKhau;
	
	@Column(name = "soDienThoai")
	private String soDienThoai;
	
	@Column(name = "avatar")
	private String avatar;
	
	@Column(name = "ngaySinh")
	private Date ngaySinh;
	
	@Column(name = "loaiNguoiDung")
	private String loaiNguoiDung;
	
	@OneToMany(mappedBy = "nguoiDung", fetch = FetchType.LAZY)
	private Set<Ve> ve;
}
