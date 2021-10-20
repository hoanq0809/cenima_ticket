package cybersoft.java12.cenima_ticket.QuanLyRap.dto;

import java.util.Set;

import cybersoft.java12.cenima_ticket.QuanLyRap.entity.Rap;

public interface LayCumRapTheoHeThongDto {
	public String getMaCumRap();
	public String getTenCumRap();
	public String getDiaChi();
	public Set<Rap> getLstRap();
}
