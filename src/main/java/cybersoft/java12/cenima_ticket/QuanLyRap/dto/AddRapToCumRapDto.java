package cybersoft.java12.cenima_ticket.QuanLyRap.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class AddRapToCumRapDto {
	@NotNull
	@Min(value = 1)
	private Long rapId;
	
	@NotNull
	@Min(value = 1)
	private Long cumRapId;
	
	/*getter setter*/
	public Long getRapId() {
		return rapId;
	}
	public void setRapId(Long rapId) {
		this.rapId = rapId;
	}
	public Long getCumRapId() {
		return cumRapId;
	}
	public void setCumRapId(Long cumRapId) {
		this.cumRapId = cumRapId;
	}
}
