package cybersoft.java12.cenima_ticket.QuanLyRap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;
import cybersoft.java12.cenima_ticket.ve.entity.ThongTinDatVe;
import cybersoft.java12.cenima_ticket.ve.entity.Ve;
@Entity
@Table(name="eticket_ghe")
public class Ghe  extends BaseEntity{
	@NotNull
	private String loaiGhe;
	@NotNull
	private int soGhe;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="thuocRap")
	private Rap thuocRap;
		
	@OneToOne
	@JoinColumn(name = "idVe")
	private Ve ve;
	
	@ManyToOne
	@JoinColumn(name = "thong_tin_dat_ve_id", referencedColumnName = "id")
	private ThongTinDatVe thongTinDatVe;
	
	public String getLoaiGhe() {
		return loaiGhe;
	}
	public void setLoaiGhe(String loaiGhe) {
		this.loaiGhe = loaiGhe;
	}
	public int getSoGhe() {
		return soGhe;
	}
	public void setSoGhe(int soGhe) {
		this.soGhe = soGhe;
	}
	
	
}
