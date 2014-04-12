package applimedical.sighal.dto;
/***********************************************************************
 * Module:  permission.java
 * Author:  HAZEM
 * Purpose: Defines the Class permission
 ***********************************************************************/

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import applimedical.sighal.api.constantes.DroitEnum;

@Entity
public class Permission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="persmission_id")
	private Long permissionId;

	@Column()
	private String description;

	@Enumerated(EnumType.ORDINAL)
	@Column()
	private DroitEnum droit;

	@Column(name="date_debut")
	private Date dateDebut;

	@Column(name="date_fin")
	private Date dateFin;


	@OneToMany (mappedBy ="permission")
	private List <RelFctModulePerm> listRelFctModulePerm;


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

	public List<RelFctModulePerm> getListRelFctModulePerm() {
		return listRelFctModulePerm;
	}

	public void setListRelFctModulePerm(List<RelFctModulePerm> listRelFctModulePerm) {
		this.listRelFctModulePerm = listRelFctModulePerm;
	}


}