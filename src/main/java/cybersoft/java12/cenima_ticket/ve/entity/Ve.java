package cybersoft.java12.cenima_ticket.ve.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;
import cybersoft.java12.cenima_ticket.film.entity.Phim;
import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;

@Entity
@Table(name = "eticket_ve")
public class Ve extends BaseEntity {
	@Column(name = "giaVe")
	private int giaVe;
	
	@Column(name = "soGhe")
	private String soGhe;
	
	@Column(name="phim_id")
	private Long phimId;
	
	@ManyToOne(optional= false)
	@JoinColumn(name="phim_id", insertable = false, updatable = false)
	@Column(name = "IdNguoiDung", insertable = false, updatable = false)

	private int idNguoiDung;
	
	@ManyToOne
	@JoinColumn(name = "IdNguoiDung")
	private NguoiDung nguoiDung;
}
