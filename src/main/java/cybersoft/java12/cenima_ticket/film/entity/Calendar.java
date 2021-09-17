package cybersoft.java12.cenima_ticket.film.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;

@Entity
@Table(name="eticket_lich_chieu")
public class Calendar extends BaseEntity {
	private Date ngay_chieu;
	
	@ManyToMany(mappedBy = "calendars", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Film> films = new HashSet<>();
}
