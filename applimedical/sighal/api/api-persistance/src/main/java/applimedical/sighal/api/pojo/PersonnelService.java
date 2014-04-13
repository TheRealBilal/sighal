package applimedical.sighal.api.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "personnel_service")
@IdClass(PersonnelServicePk.class)
public class PersonnelService implements Serializable{

	private static final long serialVersionUID = 8436614689380983800L;

	@Id
	@Column (name = "personne_id", insertable= false, updatable = false)
	private Long personnelId;

	@Id
	@Column (name = "service_id", insertable= false, updatable = false)
	private Long serviceId;


	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name ="personne_id" , referencedColumnName ="personne_id")
	private Personnel personnel;

	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name ="service_id" , referencedColumnName ="service_id")
	private Service service;

	@Column (name="is_service_chef")
	private boolean isServiceChef;
	
	@Temporal(TemporalType.TIMESTAMP) 
	@Column (name ="date_debut")
	private Date dateDebut;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name ="date_fin")
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

	public Personnel getPersonnel() {
		return personnel;
	}

	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
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