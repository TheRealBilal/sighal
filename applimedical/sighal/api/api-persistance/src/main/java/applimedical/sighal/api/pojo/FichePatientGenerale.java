package applimedical.sighal.api.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "fiche_patient_generale")
public class FichePatientGenerale extends FichePatient {

	@Column(name = "description")
	private String description;

	@Column(name = "domaine")
	private String domaine;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	

}