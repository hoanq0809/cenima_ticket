package cybersoft.java12.cenima_ticket.QuanLyRap.entity;

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
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;
import cybersoft.java12.cenima_ticket.film.entity.LichChieu;

@Entity
@Table(name="eticket_rap")
public class Rap extends BaseEntity {
	@NotBlank
	private String tenRap;
	
	@Column(name = "cumRap_Id", insertable = false, updatable = false)
	private Long cumRapId;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="cumRap_Id",nullable=false)
	private CumRap cumRap;

	@OneToMany(mappedBy ="Rap", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	Set<Ghe> listGhe = new HashSet<>();
	
	
	@OneToMany(mappedBy = "rap", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<LichChieu> suatChieus = new HashSet<>();
	/* helper method */

	/*getter setter*/
	public String getTenRap() {
		return tenRap;
	}
	public void setTenRap(String tenRap) {
		this.tenRap = tenRap;
	}

	public Long getCumRapId() {
		return cumRapId;
	}
	public void setCumRapId(Long cumRapId) {
		this.cumRapId = cumRapId;
	}

	public CumRap getCumRap() {
		return cumRap;
	}
	public void setCumRap(CumRap cumRap) {
		this.cumRap = cumRap;
	}

	public Set<Ghe> getListGhe() {
		return listGhe;
	}
	public void setListGhe(Set<Ghe> listGhe) {
		this.listGhe = listGhe;
	}

	public Set<LichChieu> getSuatChieus() {
		return suatChieus;
	}
	public void setSuatChieus(Set<LichChieu> suatChieus) {
		this.suatChieus = suatChieus;
	}
}
