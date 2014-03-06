package applimedical.sighal.api.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class FichePatient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fiche_patient_id")
	private Long fichePatientId;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "date_creation")
	private Date date_crea_fich;
	
	@Column(name = "date_maj")
	private Date date_maj_fich;
	
	@Column(name = "observation")
	private String observation;
	
	//ce champ aide un medcin 
	@Column (name ="etat_generale_patient")
	private String etatGeneraleActuelPatient;
	
	// 	plan de traitement
	@Column (name ="plan_traitement") // medicament
	 private String planTraitement;

	public Long getFichePatientId() {
		return fichePatientId;
	}

	public void setFichePatientId(Long fichePatientId) {
		this.fichePatientId = fichePatientId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDate_crea_fich() {
		return date_crea_fich;
	}

	public void setDate_crea_fich(Date date_crea_fich) {
		this.date_crea_fich = date_crea_fich;
	}

	public Date getDate_maj_fich() {
		return date_maj_fich;
	}

	public void setDate_maj_fich(Date date_maj_fich) {
		this.date_maj_fich = date_maj_fich;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}
	
	

}