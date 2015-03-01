package applimedical.sighal.api.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import applimedical.sighal.pojo.BasePojo;

@Entity
public class Module extends BasePojo {

	@Column(name ="nom_module")
	private String nom;

	@Column ()
	private String description;

	@Column()
	private Boolean active;
	
	@OneToMany (mappedBy ="module")
	private List <RelFctModulePerm> listRelFctModulePerm;

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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public List<RelFctModulePerm> getListRelFctModulePerm() {
		return listRelFctModulePerm;
	}

	public void setListRelFctModulePerm(List<RelFctModulePerm> listRelFctModulePerm) {
		this.listRelFctModulePerm = listRelFctModulePerm;
	}


}