package cybersoft.java12.cenima_ticket.film.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;
import cybersoft.java12.cenima_ticket.ve.entity.Ve;

@Entity
@Table(name = "eticket_phim")
public class Phim extends BaseEntity {
	@Column(name="ten_phim")
	@NotNull
	@Size(min= 3, max = 50)
	private String tenPhim;
	@Column(name="bi_danh")
	private String biDanh;
	@Column(name="trailer")
	private String trailer;
	@Column(name="hinh_anh")
	private String hinhAnh;
	@Column(name="mo_ta")
	private String moTa;
	@Column(name="ngay_khoi_chieu")
	@NotNull
	private Date ngayKhoiChieu;
	@Column(name="the_loai")
	@NotNull
	private String theLoai;
	
	@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinTable( name = "eticket_phim_lich_chieu",
				joinColumns = @JoinColumn(name= "phim_id"),
				inverseJoinColumns = @JoinColumn(name ="lich_chieu_id")
			)
	private Set<LichChieu> calendars = new HashSet<>();
	
	@OneToMany(mappedBy = "films", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<SuatChieu> showTimes = new HashSet<>();
	@OneToMany(mappedBy ="maVe" )
	Set<Ve> lstVe=new HashSet<>();

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public String getBiDanh() {
		return biDanh;
	}

	public void setBiDanh(String biDanh) {
		this.biDanh = biDanh;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public Date getNgayKhoiChieu() {
		return ngayKhoiChieu;
	}

	public void setNgayKhoiChieu(Date ngayKhoiChieu) {
		this.ngayKhoiChieu = ngayKhoiChieu;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public Set<LichChieu> getCalendars() {
		return calendars;
	}

	public void setCalendars(Set<LichChieu> calendars) {
		this.calendars = calendars;
	}

	public Set<SuatChieu> getShowTimes() {
		return showTimes;
	}

	public void setShowTimes(Set<SuatChieu> showTimes) {
		this.showTimes = showTimes;
	}
	
	
}
