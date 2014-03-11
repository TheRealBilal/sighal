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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "type_soin")
public class TypeDeSoin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="type_soin_id")
	private Long typeSoinId;

	@Column(name ="nom_type")
	private String nomType;

	@Column(name ="categorie_type")
	private String categorieType;

	@Column()
	private String description;

	@OneToMany(mappedBy = "soin_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public Set<Soin> soin;

	public Long getTypeSoinId() {
		return typeSoinId;
	}

	public void setTypeSoinId(Long typeSoinId) {
		this.typeSoinId = typeSoinId;
	}

	public String getNomType() {
		return nomType;
	}

	public void setNomType(String nomType) {
		this.nomType = nomType;
	}

	public String getCategorieType() {
		return categorieType;
	}

	public void setCategorieType(String categorieType) {
		this.categorieType = categorieType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Soin> getListSoin() {
		List<Soin> listSoin = new ArrayList<Soin>();
		for (Soin org : soin) {
			listSoin.add(org);
		}
		return listSoin;
	}


	public void setListSoinAsList(List<Soin> soins) {
		Set<Soin> listSoin = new HashSet<Soin>();
		for (Soin soin : soins) {
			listSoin.add(soin);
		}
		this.soin = listSoin;
	}


}