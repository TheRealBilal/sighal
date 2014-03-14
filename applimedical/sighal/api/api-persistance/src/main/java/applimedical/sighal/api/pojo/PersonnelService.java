package applimedical.sighal.api.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "personnel_service")
@IdClass(PersonnelServicePk.class)
public class PersonnelService {

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



}