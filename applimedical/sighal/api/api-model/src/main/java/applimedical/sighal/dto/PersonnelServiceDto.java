package applimedical.sighal.dto;

import java.io.Serializable;
import java.util.Date;

public class PersonnelServiceDto implements Serializable{

	private static final long serialVersionUID = 8436614689380983800L;
	private Long personnelId;

	private Long serviceId;

	private PersonnelDto personnelDto;

	private ServiceDto serviceDto;

	private boolean isServiceChef;

	private Date dateDebut;
	
	private Date dateFin;

	public Long getPersonnelId() {
		return personnelId;
	}

	public void setPersonnelId(Long personnelId) {
		this.personnelId = personnelId;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public PersonnelDto getPersonnelDto() {
		return personnelDto;
	}

	public void setPersonnelDto(PersonnelDto personnelDto) {
		this.personnelDto = personnelDto;
	}

	public ServiceDto getServiceDto() {
		return serviceDto;
	}

	public void setServiceDto(ServiceDto serviceDto) {
		this.serviceDto = serviceDto;
	}

	public boolean isServiceChef() {
		return isServiceChef;
	}

	public void setServiceChef(boolean isServiceChef) {
		this.isServiceChef = isServiceChef;
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

	
}