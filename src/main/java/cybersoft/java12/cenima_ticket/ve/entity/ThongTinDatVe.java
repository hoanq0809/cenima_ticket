package cybersoft.java12.cenima_ticket.ve.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import cybersoft.java12.cenima_ticket.Rap.entity.Ghe;
import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;
import cybersoft.java12.cenima_ticket.nguoi_dung.entity.NguoiDung;

@Entity
@Table(name=" eticket_thong_tin_dat_ve")
public class ThongTinDatVe extends BaseEntity {
	@Column(name = "gia_ve")
	@NotNull
	private int giaVe;
	@Column(name= "ten_phim")
	@NotNull
	private String tenPhim;
	@Column(name = "thoi_luong_phim")
	@NotNull
	private LocalDateTime thoiLuongPhim;
	
	@Column(name = "nguoi_dung_id")
	@NotNull
	private Long nguoiDungId;
	@ManyToOne(optional = false)
	@JoinColumn(name = "nguoi_dung_id", insertable = false, updatable = false)
	private NguoiDung nguoiDung;
	
	@OneToOne
	@JoinColumn(name = "ve_id", referencedColumnName = "id" )
	private Ve ve;
	

}
