package applimedical.sighal.api.pojo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "soin")
public class Soin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "soin_id")
	private Long soinId;

	@Column (name= "type_soin")
	private String typeSoin;

	@Column ()
	private String description;

	@OneToMany(mappedBy = "soin", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public List<MembreOrgane> membresOrgane;

	@ManyToOne
	public TypeDeSoin typeDeSoin;

	public Long getSoinId() {
		return soinId;
	}

	public void setSoinId(Long soinId) {
		this.soinId = soinId;
	}

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





}