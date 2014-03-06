package applimedical.sighal.api.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fiche_patient_dentaire")
public class FichePatientDentaire extends FichePatient {

	//	incisive centrale,
	@Column(name = "incisive_centrale")
	private String incisivCentrale;

	//	incisive latérale,
	@Column(name = "incisive_laterale")
	private String incisivLaterale;

	//	canine
	@Column(name = "canine")
	private String canine;


	//	prémolaire1,
	@Column(name = "premolaire1")
	private String premolaire1;


	//	prémolaire2,
	@Column(name = "premolaire2")
	private String premolaire2;


	//	molaire1,
	@Column(name = "molaire1")
	private String molaire1;


	//	molaire2,
	@Column(name = "molaire2")
	private String molaire2;


	//	molaire3,
	@Column(name = "molaire3")
	private String molaire3;

	//	motif de consultation 
	@Column(name = "motif_consultation")
	private String motifConsultation;

	//	date de consultation
	@Column(name = "date_consultation")
	private Date dateConsultation;


}