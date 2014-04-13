package applimedical.sighal.dto;

import java.util.List;

public class TypeInterventionDto {

	private Long typeIntervId;

	private String nom;

	private String description;

	private List<InterventionDto> interventionDtoList;

	public Long getTypeIntervId() {
		return typeIntervId;
	}

	public void setTypeIntervId(Long typeIntervId) {
		this.typeIntervId = typeIntervId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<InterventionDto> getInterventionDtoList() {
		return interventionDtoList;
	}

	public void setInterventionDtoList(List<InterventionDto> interventionDtoList) {
		this.interventionDtoList = interventionDtoList;
	}
}