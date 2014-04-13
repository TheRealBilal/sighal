package applimedical.sighal.dto;

import java.util.Date;
import java.util.List;

import applimedical.sighal.api.constantes.DroitEnum;

public class PermissionDto {

	private Long permissionId;

	private String description;

	private DroitEnum droit;

	private Date dateDebut;

	private Date dateFin;

	private List <RelFctModulePermDto> relFctModulePermDtoList;

	public Long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Long permissionId) {
		this.permissionId = permissionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DroitEnum getDroit() {
		return droit;
	}

	public void setDroit(DroitEnum droit) {
		this.droit = droit;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public List<RelFctModulePermDto> getRelFctModulePermDtoList() {
		return relFctModulePermDtoList;
	}

	public void setRelFctModulePermDtoList(List<RelFctModulePermDto> relFctModulePermDtoList) {
		this.relFctModulePermDtoList = relFctModulePermDtoList;
	}


}