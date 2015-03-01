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
@Table(name ="type_intervention")
public class TypeIntervention extends BasePojo {

	@Column()
	private String nom;

	@Column()
	private String description;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "typeIntervention", fetch=FetchType.LAZY)
	private List<Intervention> interventionList;

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

	public List<Intervention> getInterventionList() {
		return interventionList;
	}

	public void setInterventionList(List<Intervention> interventionList) {
		this.interventionList = interventionList;
	}
}