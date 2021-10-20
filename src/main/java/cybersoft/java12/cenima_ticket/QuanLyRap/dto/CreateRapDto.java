package cybersoft.java12.cenima_ticket.QuanLyRap.dto;

import javax.validation.constraints.NotBlank;

public class CreateRapDto {
	@NotBlank
	private String tenRap;
	
	/*getter setter*/
	public String getTenRap() {
		return tenRap;
	}

	public void setTenRap(String tenRap) {
		this.tenRap = tenRap;
	}
}
