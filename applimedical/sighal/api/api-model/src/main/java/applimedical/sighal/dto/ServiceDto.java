package applimedical.sighal.dto;

import java.util.Date;
import java.util.List;

public class ServiceDto {

	private Long serviceId;

	private String nom;

	private String description;

	private Date dateOuverture;

	private List<PersonnelServiceDto> personnelServiceDtoList;

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
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

	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public List<PersonnelServiceDto> getPersonnelServiceDtoList() {
		return personnelServiceDtoList;
	}

	public void setPersonnelServiceDtoList(List<PersonnelServiceDto> personnelServiceDtoList) {
		this.personnelServiceDtoList = personnelServiceDtoList;
	}

}