package cybersoft.java12.cenima_ticket.QuanLyRap.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;

@Entity
@Table(name="eticket_hethongrap")
public class HeThongRap extends BaseEntity {
	@NotNull
	@Column(unique = true)
	private String name;
	
	@NotNull
	private String maHeThong;
	
	@NotNull
	private String biDanh;
	
	@NotNull
	private String linkImageLogo;
	
	@OneToMany(mappedBy = "heThongRap",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<CumRap> cumRap = new HashSet<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLinkImage() {
		return linkImageLogo;
	}
	public void setLinkImage(String linkImageLogo) {
		this.linkImageLogo = linkImageLogo;
	}
	public String getMaHeThong() {
		return maHeThong;
	}
	public void setMaHeThong(String maHeThong) {
		this.maHeThong = maHeThong;
	}
	public String getBiDanh() {
		return biDanh;
	}
	public void setBiDanh(String biDanh) {
		this.biDanh = biDanh;
	}
	public Set<CumRap> getCumRap() {
		return cumRap;
	}
	public void setCumRap(Set<CumRap> cumRap) {
		this.cumRap = cumRap;
	}		
}
