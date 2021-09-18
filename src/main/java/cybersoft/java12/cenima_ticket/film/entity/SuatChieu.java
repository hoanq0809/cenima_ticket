package cybersoft.java12.cenima_ticket.film.entity;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import cybersoft.java12.cenima_ticket.Rap.entity.Rap;
import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;

@Entity
@Table(name="eticket_suat_chieu")
public class SuatChieu extends BaseEntity {
	
	@Column(name = "gio_chieu")
	@NotNull
	private LocalDateTime gioChieu;
	
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
	
	
}
