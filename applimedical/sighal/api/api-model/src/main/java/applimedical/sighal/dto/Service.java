package applimedical.sighal.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "service_id")
	private Long serviceId;

	@Column()
	private String nom;

	@Column()
	private String description;

	@Column(name ="date_ouverture")
	private Date dateOuverture;

	@OneToMany(mappedBy = "service")
	private List<PersonnelService> listPerssonelService;


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


	public List<PersonnelService> getListPerssonelService() {
		return listPerssonelService;
	}

	public void setListPerssonelService(List<PersonnelService> listPerssonelService) {
		this.listPerssonelService = listPerssonelService;
	}

}