package cybersoft.java12.cenima_ticket.Rap.entity;

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
@Table(name="cinema_hethongrap")
public class HeThongRap extends BaseEntity {
	@NotNull
	@Column(unique = true)
	private String name;
	@NotNull
	private String linkImage;
	@OneToMany(mappedBy = "tenCumRap",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Set<CumRap> cumRap=new HashSet<>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLinkImage() {
		return linkImage;
	}
	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}
	
	
}
