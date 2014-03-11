package applimedical.sighal.api.pojo.tmp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import applimedical.sighal.api.pojo.Personne;
import applimedical.sighal.api.pojo.Personnel;
import applimedical.sighal.api.pojo.PersonnelServicePk;
import applimedical.sighal.api.pojo.Service;




@Entity
@Table(name = "personnel_service")
@IdClass(PersonnelServicePk.class)
public class PersonnelService {

	@Column(name="personnel_id")
	private Long personnelId;

	@Column(name="service_id")
	private Long serviceId;

	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private Personnel personnel;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private Service service;
	
	

	@Column (name="is_service_chef")
	private boolean isServiceChef;



}