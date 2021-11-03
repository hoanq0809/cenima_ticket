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
	
	// @Column(name="rap_id", insertable = false, updatable = false)
	// private Long rapId;
	
	// @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	// @JoinColumn(name="rap_id")
	// private Rap Rap;
	@NotNull
	private String tenGhe;
	public String getTenGhe() {
		return tenGhe;
	}
	public void setTenGhe(String tenGhe) {
		this.tenGhe = tenGhe;
	}
	public Boolean getDaDat() {
		return daDat;
	}
	public void setDaDat(Boolean daDat) {
		this.daDat = daDat;
	}
	public long getRapID() {
		return rapID;
	}
	public void setRapID(long rapID) {
		this.rapID = rapID;
	}
	public Rap getThuocRap() {
		return thuocRap;
	}
	public void setThuocRap(Rap thuocRap) {
		this.thuocRap = thuocRap;
	}
	public Ve getVe() {
		return ve;
	}
	public void setVe(Ve ve) {
		this.ve = ve;
	}

	
	@NotNull
	private Boolean daDat=false;
	@Column(name="rap_id")
	private long rapID;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	
	@JoinColumn(name="rap_id",insertable = false,updatable = false)
	private Rap rap;
		
	@OneToOne(mappedBy = "ghe", fetch = FetchType.LAZY)
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
