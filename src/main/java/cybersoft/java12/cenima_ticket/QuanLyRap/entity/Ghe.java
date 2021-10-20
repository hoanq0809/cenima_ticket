package cybersoft.java12.cenima_ticket.QuanLyRap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;
import cybersoft.java12.cenima_ticket.ve.entity.Ve;
@Entity
@Table(name="eticket_ghe")
public class Ghe extends BaseEntity{
	
	@NotNull
	private String loaiGhe;
	
	@NotNull
	private int soGhe;
	
	@Column(name="rap_id", insertable = false, updatable = false)
	private Long rapId;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="rap_id")
	private Rap Rap;
		
	@OneToOne
	@JoinColumn(name = "idVe")
	private Ve ve;
	
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
