package cybersoft.java12.cenima_ticket.film.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import cybersoft.java12.cenima_ticket.QuanLyRap.entity.Rap;
import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;
import cybersoft.java12.cenima_ticket.ve.entity.Ve;

@Entity
@Table(name="eticket_suat_chieu")
public class LichChieu extends BaseEntity {
	
	@Column(name = "gio_chieu")
	@NotNull
	private LocalDateTime gioChieu;
	@Column(name="ngay_chieu")
	@NotNull
	private Date ngayChieu;

	@Column(name="film_id",nullable = false)
	private int filmId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="film_id",insertable=false, updatable=false)
	private Phim films;
	
	@Column(name="rap_id")
	private int rapId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="rap_id", insertable = false, updatable = false)
	private Rap rap;
	
	@OneToMany(mappedBy = "lichChieu",fetch = FetchType.LAZY)
	private Set<Ve> ve = new HashSet<>();
	
	public LocalDateTime getGioChieu() {
		return gioChieu;
	}

	public void setGioChieu(LocalDateTime gioChieu) {
		this.gioChieu = gioChieu;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public Phim getFilms() {
		return films;
	}

	public void setFilms(Phim films) {
		this.films = films;
	}
	
	public Date getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(Date ngayChieu) {
		this.ngayChieu = ngayChieu;
	}

	public int getRapId() {
		return rapId;
	}

	public void setRapId(int rapId) {
		this.rapId = rapId;
	}

	public Rap getRap() {
		return rap;
	}

	public void setRap(Rap rap) {
		this.rap = rap;
	}
}
