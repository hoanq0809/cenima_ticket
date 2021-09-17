package cybersoft.java12.cenima_ticket.film.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;

@Entity
@Table(name = "eticket_phim")
public class Film extends BaseEntity {
	
	private String ten_phim;
	private String bi_danh;
	private String trailer;
	private String hinh_anh;
	private String mo_ta;
	private Date ngay_khoi_chieu;
	private String the_loai;
	
	@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinTable( name = "eticket_phim_lich_chieu",
				joinColumns = @JoinColumn(name= "phim_id"),
				inverseJoinColumns = @JoinColumn(name ="lich_chieu_id")
			)
	private Set<Calendar> calendars = new HashSet<>();
	
	@OneToMany(mappedBy = "films", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<ShowTime> showTimes = new HashSet<>();
	
}
