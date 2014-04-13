package applimedical.sighal.dto;

import java.util.List;

public class ModuleDto {

	private Long moduleId;

	private String nom;

	private String description;

	private Boolean active;
	
	private List <RelFctModulePermDto> listRelFctModulePerm;

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<RelFctModulePermDto> getListRelFctModulePerm() {
		return listRelFctModulePerm;
	}

	public void setListRelFctModulePerm(List<RelFctModulePermDto> listRelFctModulePerm) {
		this.listRelFctModulePerm = listRelFctModulePerm;
	}


}