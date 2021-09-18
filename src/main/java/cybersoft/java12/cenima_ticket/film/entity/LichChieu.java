package cybersoft.java12.cenima_ticket.film.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;

@Entity
@Table(name="eticket_lich_chieu")
public class LichChieu extends BaseEntity {
	@Column(name = "ngay_chieu")
	@NotNull
	private Date ngayChieu;
	
	@ManyToMany(mappedBy = "calendars", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Phim> films = new HashSet<>();

	public Date getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(Date ngayChieu) {
		this.ngayChieu = ngayChieu;
	}

	public Set<Phim> getFilms() {
		return films;
	}

	public void setFilms(Set<Phim> films) {
		this.films = films;
	}
	
	
}
