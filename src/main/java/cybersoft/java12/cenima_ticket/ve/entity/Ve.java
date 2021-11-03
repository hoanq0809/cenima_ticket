package cybersoft.java12.cenima_ticket.ve.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import cybersoft.java12.cenima_ticket.QuanLyRap.entity.Ghe;
import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;
import cybersoft.java12.cenima_ticket.film.entity.LichChieu;
import cybersoft.java12.cenima_ticket.film.entity.Phim;
import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;

@Entity
@Table(name = "eticket_ve")
public class Ve extends BaseEntity {
	@Column(name = "giaVe")
	private int giaVe;
	@Column(name="ngay_dat")
	private LocalDate ngayDat; 	
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="ma_lich_chieu",nullable = false,referencedColumnName = "id")
	private LichChieu maLichChieu;

	
	@ManyToOne(optional= false)
	@JoinColumn(name="phim_id",referencedColumnName = "id")
	private Phim thuocPhim;
	
	
	@Column(name = "lichchieu_id", insertable = false, updatable = false)
	private int lichChieuId;

	
	@ManyToOne(optional = false)
	@JoinColumn(name = "nguoi_dung_id", nullable = true, referencedColumnName = "id")
	private NguoiDung nguoiDung;
	
	@OneToOne
	@JoinColumn(name ="ghe_id", referencedColumnName = "id")
	private Ghe ghe;

	public LocalDate getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(LocalDate ngayDat) {
		this.ngayDat = ngayDat;
	}

	public int getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(int giaVe) {
		this.giaVe = giaVe;
	}

	public LichChieu getMaLichChieu() {
		return maLichChieu;
	}

	public void setMaLichChieu(LichChieu maLichChieu) {
		this.maLichChieu = maLichChieu;
	}

	public Phim getThuocPhim() {
		return thuocPhim;
	}

	public void setThuocPhim(Phim thuocPhim) {
		this.thuocPhim = thuocPhim;
	}

	@ManyToOne
	@JoinColumn(name = "lichchieu_id", referencedColumnName = "id")
	private LichChieu lichChieu;
	
}
