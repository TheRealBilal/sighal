package applimedical.sighal.dto;

import java.io.Serializable;
import java.util.List;

public class FonctionDto implements Serializable {
	private static final long serialVersionUID = 3162907901260184989L;

	private Long fonctionId;

	private String nomFonction;

	private String description;

	private Boolean active;

	private List<RelFctModulePermDto> relFctModulePermDtoList;

	public String getNomFonction() {
		return nomFonction;
	}

	public void setNomFonction(String nomFonction) {
		this.nomFonction = nomFonction;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Long getFonctionId() {
		return fonctionId;
	}

	public void setFonctionId(Long fonctionId) {
		this.fonctionId = fonctionId;
	}

	public List<RelFctModulePermDto> getRelFctModulePermDtoList() {
		return relFctModulePermDtoList;
	}

	public void setRelFctModulePermDtoList(List<RelFctModulePermDto> relFctModulePermDtoList) {
		this.relFctModulePermDtoList = relFctModulePermDtoList;
	}
}