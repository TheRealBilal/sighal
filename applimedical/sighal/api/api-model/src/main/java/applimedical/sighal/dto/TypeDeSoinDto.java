package applimedical.sighal.dto;

import java.util.List;

public class TypeDeSoinDto {

	private Long typeSoinId;

	private String nomType;

	private String categorieType;

	private String description;

	private List<SoinDto> soinDtoList;

	public Long getTypeSoinId() {
		return typeSoinId;
	}

	public void setTypeSoinId(Long typeSoinId) {
		this.typeSoinId = typeSoinId;
	}

	public String getNomType() {
		return nomType;
	}

	public void setNomType(String nomType) {
		this.nomType = nomType;
	}

	public String getCategorieType() {
		return categorieType;
	}

	public void setCategorieType(String categorieType) {
		this.categorieType = categorieType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SoinDto> getSoinDtoList() {
		return soinDtoList;
	}

	public void setSoinDtoList(List<SoinDto> soinDtoList) {
		this.soinDtoList = soinDtoList;
	}

	

}