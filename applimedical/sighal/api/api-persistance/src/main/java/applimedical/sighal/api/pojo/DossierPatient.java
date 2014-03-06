package applimedical.sighal.api.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "dossier_patient")
public class DossierPatient {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dossier_id")
	private int dossierId;

	@Column(name = "date_creation")
	private Date date_crea_doss;

	@Column(name = "date_maj")
	private Date date_maj_doss;

	
	
	public int getDossierId() {
		return dossierId;
	}

	public void setDossierId(int dossierId) {
		this.dossierId = dossierId;
	}

	public Date getDate_crea_doss() {
		return date_crea_doss;
	}

	public void setDate_crea_doss(Date date_crea_doss) {
		this.date_crea_doss = date_crea_doss;
	}

	public Date getDate_maj_doss() {
		return date_maj_doss;
	}

	public void setDate_maj_doss(Date date_maj_doss) {
		this.date_maj_doss = date_maj_doss;
	}
}