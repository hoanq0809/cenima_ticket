package cybersoft.java12.cenima_ticket.Rap.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;

@Entity
@Table(name="cinema_rap")
public class Rap extends BaseEntity {
	private int soRap;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="thuocCumRap",nullable=false)
	private CumRap thuocCumRap;
	@NotNull
	@Column(unique = true)
	private String suatChieu;
//	lstGhe
	@OneToMany(mappedBy ="soGhe", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	Set<Ghe> lstGhe=new HashSet<>();
	public int getSoRap() {
		return soRap;
	}
	public void setSoRap(int soRap) {
		this.soRap = soRap;
	}
	public CumRap getThuocCumRap() {
		return thuocCumRap;
	}
	public void setThuocCumRap(CumRap thuocCumRap) {
		this.thuocCumRap = thuocCumRap;
	}
	public String getSuatChieu() {
		return suatChieu;
	}
	public void setSuatChieu(String suatChieu) {
		this.suatChieu = suatChieu;
	}
	
}
