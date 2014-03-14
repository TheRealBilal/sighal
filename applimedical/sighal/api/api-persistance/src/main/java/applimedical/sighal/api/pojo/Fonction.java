package applimedical.sighal.api.pojo;
/***********************************************************************
 * Module:  Fonction.java
 * Author:  HAZEM
 * Purpose: Defines the Class Fonction
 ***********************************************************************/

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*reste les jointure avec personne et service et permission*/

@Entity
@Table(name = "fonction")
public class Fonction implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3162907901260184989L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fonction_id")
	private Long fonctionId;

	@Column(name = "nom_fonction")
	private String nomFonction;

	@Column(name = "description")
	private String description;

	@Column(name = "active")
	private boolean active;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fonction", fetch=FetchType.LAZY)
	private List<RelFctModulePerm> listRelFctModulePerm;



	public Long getCodeFonction() {
		return fonctionId;
	}

	public void setCodeFonction(Long codeFonction) {
		this.fonctionId = codeFonction;
	}

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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Long getFonctionId() {
		return fonctionId;
	}

	public void setFonctionId(Long fonctionId) {
		this.fonctionId = fonctionId;
	}

	public List<RelFctModulePerm> getListRelFctModulePerm() {
		return listRelFctModulePerm;
	}

	public void setListRelFctModulePerm(List<RelFctModulePerm> listRelFctModulePerm) {
		this.listRelFctModulePerm = listRelFctModulePerm;
	}




}