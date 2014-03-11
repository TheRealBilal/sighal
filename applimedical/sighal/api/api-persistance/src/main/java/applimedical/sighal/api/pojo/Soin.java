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

import applimedical.sighal.api.pojo.tmp.MembreOrgane;


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

	@OneToMany(mappedBy = "organe_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public Set<MembreOrgane> membresOrgane;

	@OneToMany(mappedBy = "type_soin_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public Set<TypeDeSoin> typeDeSoin;


	public List<MembreOrgane> getListMembresOrgane() {
		List<MembreOrgane> listOrganes = new ArrayList<MembreOrgane>();
		for (MembreOrgane org : membresOrgane) {
			listOrganes.add(org);
		}
		return listOrganes;
	}


	public void setListMembresOrganeAsList(List<MembreOrgane> membresOrgene) {
		Set<MembreOrgane> listOrgenes = new HashSet<MembreOrgane>();
		for (MembreOrgane org : membresOrgene) {
			listOrgenes.add(org);
		}
		this.membresOrgane = listOrgenes;
	}


	public List<TypeDeSoin> getListTypeSoin() {
		List<TypeDeSoin> listOrganes = new ArrayList<TypeDeSoin>();
		for (TypeDeSoin type : typeDeSoin) {
			listOrganes.add(type);
		}
		return listOrganes;
	}


	public void setListTypeSoineAsList(List<TypeDeSoin> typeDeSoin) {
		Set<TypeDeSoin> types = new HashSet<TypeDeSoin>();
		for (TypeDeSoin type : typeDeSoin) {
			types.add(type);
		}
		this.typeDeSoin = types;
	}


}