package cybersoft.java12.cenima_ticket.film.entity;

import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;

@Entity
@Table(name="eticket_xuat_chieu")
public class ShowTime extends BaseEntity {
	private LocalDateTime gio_chieu;
	
	@Column(name="film_id",nullable = false)
	private int filmId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="film_id",insertable=false, updatable=false)
	
	private Film films;
}
