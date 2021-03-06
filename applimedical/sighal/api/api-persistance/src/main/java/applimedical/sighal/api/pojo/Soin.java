package applimedical.sighal.api.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import applimedical.sighal.pojo.BasePojo;


@Entity
@Table(name = "soin")
public class Soin extends BasePojo {

	@Column (name= "type_soin")
	private String typeSoin;

	@Column ()
	private String description;

	@OneToMany(mappedBy = "soin", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<MembreOrgane> membresOrgane;

	@ManyToOne
	@JoinColumn (name ="type_soin_id", referencedColumnName= "id")
	private TypeDeSoin typeDeSoin;
	
	@ManyToOne
	@JoinColumn (name ="intervention_id", referencedColumnName= "id")
	private Intervention intervention;

	public String getTypeSoin() {
		return typeSoin;
	}

	public void setTypeSoin(String typeSoin) {
		this.typeSoin = typeSoin;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<MembreOrgane> getMembresOrgane() {
		return membresOrgane;
	}

	public void setMembresOrgane(List<MembreOrgane> membresOrgane) {
		this.membresOrgane = membresOrgane;
	}

	public TypeDeSoin getTypeDeSoin() {
		return typeDeSoin;
	}

	public void setTypeDeSoin(TypeDeSoin typeDeSoin) {
		this.typeDeSoin = typeDeSoin;
	}

	public Intervention getIntervention() {
		return intervention;
	}

	public void setIntervention(Intervention intervention) {
		this.intervention = intervention;
	}





}