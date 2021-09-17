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
@Table(name= "cinema_cumrap")
public class CumRap extends BaseEntity {
	@NotNull
	 private String name;
	@NotNull
	 private String diaChi;
	 @ManyToOne(fetch = FetchType.LAZY,optional = false)
	 @JoinColumn(name="heThongRap",nullable = false)
	 private HeThongRap heThongRap;
	 //lst rap
	 @OneToMany(mappedBy ="soRap",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	 private Set<Rap> lstRap=new HashSet<>();
	 //	 lst phim theo rap
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public HeThongRap getHeThongRap() {
		return heThongRap;
	}
	public void setHeThongRap(HeThongRap heThongRap) {
		this.heThongRap = heThongRap;
	}
	 
	 
}
