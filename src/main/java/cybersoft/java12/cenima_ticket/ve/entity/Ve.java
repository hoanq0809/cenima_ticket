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
	@NotNull
	private String maVe;
	private boolean daDat=false;
	@NotNull
	private String loaiGhe;
	@NotNull
	private String stt;
	@NotNull
	private String maRap;
	@NotNull
	private int giaVe;
	@NotNull
	private String maGhe;
	@ManyToOne
	@JoinColumn(name="thuocPhim")
	
	private Phim thuocPhim;
	@Column(name = "IdNguoiDung", insertable = false, updatable = false)

	private int idNguoiDung;
	
	@ManyToOne
	@JoinColumn(name = "IdNguoiDung")
	private NguoiDung nguoiDung;
}
