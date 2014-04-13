package applimedical.sighal.dto;

import java.io.Serializable;

public class MembreOrganeDto implements Serializable{

	private static final long serialVersionUID = -4644774829450498276L;

	private Long organeId;

	private SoinDto soinDto;

	public Long getOrganeId() {
		return organeId;
	}

	public void setOrganeId(Long organeId) {
		this.organeId = organeId;
	}

	public SoinDto getSoinDto() {
		return soinDto;
	}

	public void setSoinDto(SoinDto soinDto) {
		this.soinDto = soinDto;
	}
	
	
}