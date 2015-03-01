package applimedical.sighal.api.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import applimedical.sighal.pojo.BasePojo;

@Entity
@Table(name = "fonction")
public class Fonction extends BasePojo {

	@Column(name = "nom_fonction")
	private String nomFonction;

	@Column(name = "description")
	private String description;

	@Column(name = "active")
	private Boolean active;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fonction", fetch=FetchType.LAZY)
	private List<RelFctModulePerm> relFctModulePermList;
	
	@OneToMany(mappedBy = "fonction", fetch=FetchType.LAZY)
	private List<Personnel> personnelList;


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

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<RelFctModulePerm> getRelFctModulePermList() {
		return relFctModulePermList;
	}

	public void setRelFctModulePermList(List<RelFctModulePerm> relFctModulePermList) {
		this.relFctModulePermList = relFctModulePermList;
	}
	
	public List<Personnel> getPersonnelList() {
		return personnelList;
	}

	public void setPersonnelList(List<Personnel> personnelList) {
		this.personnelList = personnelList;
	}
}