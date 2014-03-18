package applimedical.sighal.api.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import applimedical.sighal.api.constantes.DomaineEnum;

@Entity
@Table(name="fiche_patient_generale")
@DiscriminatorValue("1")
public class FichePatientGenerale extends FichePatient {

	@Column(name = "description")
	private String description;

	@Column(name = "domaine")
	private DomaineEnum domaine;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DomaineEnum getDomaine() {
		return domaine;
	}

	public void setDomaine(DomaineEnum domaine) {
		this.domaine = domaine;
	}
	

}