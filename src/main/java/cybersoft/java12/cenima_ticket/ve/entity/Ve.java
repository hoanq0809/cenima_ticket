package cybersoft.java12.cenima_ticket.ve.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import cybersoft.java12.cenima_ticket.QuanLyRap.entity.Ghe;
import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;
import cybersoft.java12.cenima_ticket.film.entity.LichChieu;
import cybersoft.java12.cenima_ticket.film.entity.Phim;
import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;

@Entity
@Table(name = "eticket_ve")
public class Ve extends BaseEntity {
	@Column(name = "giaVe")
	private Integer giaVe;
	
	@Column(name = "soGhe")
	private String soGhe;
	
	@Column(name="phim_id")
	private Long phimId;
	@ManyToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="ma_lich_chieu",nullable = false,referencedColumnName = "id")
	private LichChieu maLichChieu;
	@ManyToOne(optional= false)
	@JoinColumn(name="phim_id", insertable = false, updatable = false)
	private Phim thuocPhim;
	@Column(name = "IdNguoiDung", insertable = false, updatable = false)
	private Integer idNguoiDung;
	
	@Column(name = "lichchieu_id", insertable = false, updatable = false)
	private Integer lichChieuId;
	
	@ManyToOne
	@JoinColumn(name = "lichchieu_id")
	private LichChieu lichChieu;

	@ManyToOne
	@JoinColumn(name = "IdNguoiDung",nullable = true)
	private NguoiDung nguoiDung;
	
	@OneToOne(mappedBy = "ve",fetch = FetchType.LAZY)
	private Ghe ghe;
	
	

	public int getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(int giaVe) {
		this.giaVe = giaVe;
	}

	public String getSoGhe() {
		return soGhe;
	}

	public void setSoGhe(String soGhe) {
		this.soGhe = soGhe;
	}

	public Long getPhimId() {
		return phimId;
	}

	public void setPhimId(Long phimId) {
		this.phimId = phimId;
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

	public Integer getIdNguoiDung() {
		return idNguoiDung;
	}

	public void setIdNguoiDung(int idNguoiDung) {
		this.idNguoiDung = idNguoiDung;
	}

	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}

	public Ghe getGhe() {
		return ghe;
	}

	public void setGhe(Ghe ghe) {
		this.ghe = ghe;
	}

	
	
	
}
