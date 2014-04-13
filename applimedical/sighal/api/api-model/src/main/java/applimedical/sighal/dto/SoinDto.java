package applimedical.sighal.dto;

import java.util.List;

public class SoinDto {
	private Long soinId;

	private String typeSoin;

	private String description;

	private List<MembreOrganeDto> membresOrganeDtoList;

	private TypeDeSoinDto typeDeSoinDto;

	private InterventionDto interventionDto;

	public Long getSoinId() {
		return soinId;
	}

	public void setSoinId(Long soinId) {
		this.soinId = soinId;
	}

	public String getTypeSoin() {
		return typeSoin;
	}

	public void setTypeSoin(String typeSoin) {
		this.typeSoin = typeSoin;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<MembreOrganeDto> getMembresOrganeDtoList() {
		return membresOrganeDtoList;
	}

	public void setMembresOrganeDtoList(List<MembreOrganeDto> membresOrganeDtoList) {
		this.membresOrganeDtoList = membresOrganeDtoList;
	}

	public TypeDeSoinDto getTypeDeSoinDto() {
		return typeDeSoinDto;
	}

	public void setTypeDeSoinDto(TypeDeSoinDto typeDeSoinDto) {
		this.typeDeSoinDto = typeDeSoinDto;
	}

	public InterventionDto getInterventionDto() {
		return interventionDto;
	}

	public void setInterventionDto(InterventionDto interventionDto) {
		this.interventionDto = interventionDto;
	}





}