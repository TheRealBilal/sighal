package applimedical.sighal.api.pojo;

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

	@OneToMany(mappedBy = "typeDeSoin", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Soin> soin;

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

	public List<Soin> getSoin() {
		return soin;
	}

	public void setSoin(List<Soin> soin) {
		this.soin = soin;
	}

	

}