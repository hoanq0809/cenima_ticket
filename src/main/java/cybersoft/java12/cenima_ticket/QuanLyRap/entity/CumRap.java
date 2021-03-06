package cybersoft.java12.cenima_ticket.QuanLyRap.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import cybersoft.java12.cenima_ticket.common.entity.BaseEntity;
import cybersoft.java12.cenima_ticket.film.entity.Phim;

@Entity
@Table(name = "eticket_cumrap")
public class CumRap extends BaseEntity {
	@NotNull
	@Column(name = "ten_cum_rap")
	private String tenCumRap;
	
	@NotNull
	private String maCumRap;
	
	@NotNull
	private String diaChi;
	
	@Column(name = "heThongRap_Id", insertable = false, updatable = false)
	private Long heThongRapId;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="heThongRap_Id", nullable = false)
	private HeThongRap heThongRap;
	
	 
	@OneToMany(mappedBy ="cumRap", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Rap> listRap = new HashSet<>();
	
	/* helper method*/
	public void addRap(Rap rap) {
		this.listRap.add(rap);
	}
	 
	@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST })
	@JoinTable( name="eticket_danh_sach_phim",
				joinColumns = @JoinColumn(name="cum_rap_id"),
				inverseJoinColumns = @JoinColumn(name="phim_id")
			  )
	private Set<Phim> lstPhim = new HashSet<>();
	
	/*getter and setter*/
	public String getTenCumRap() {
		return tenCumRap;
	}

	public void setTenCumRap(String tenCumRap) {
		this.tenCumRap = tenCumRap;
	}

	public String getMaCumRap() {
		return maCumRap;
	}

	public void setMaCumRap(String maCumRap) {
		this.maCumRap = maCumRap;
	}
	
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Long getHeThongRapId() {
		return heThongRapId;
	}

	public void setHeThongRapId(Long heThongRapId) {
		this.heThongRapId = heThongRapId;
	}

	public HeThongRap getHeThongRap() {
		return heThongRap;
	}

	public void setHeThongRap(HeThongRap heThongRap) {
		this.heThongRap = heThongRap;
	}

	public Set<Rap> getLstRap() {
		return listRap;
	}

	public void setLstRap(Set<Rap> lstRap) {
		this.listRap = lstRap;
	}

	public Set<Phim> getLstPhim() {
		return lstPhim;
	}

	public void setLstPhim(Set<Phim> lstPhim) {
		this.lstPhim = lstPhim;
	}
	
}
