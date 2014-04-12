package applimedical.sighal.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fiche_patient_dentaire")
@DiscriminatorValue("2")
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

   public String getIncisivCentrale() {
      return incisivCentrale;
   }

   public void setIncisivCentrale(String incisivCentrale) {
      this.incisivCentrale = incisivCentrale;
   }

   public String getIncisivLaterale() {
      return incisivLaterale;
   }

   public void setIncisivLaterale(String incisivLaterale) {
      this.incisivLaterale = incisivLaterale;
   }

   public String getCanine() {
      return canine;
   }

   public void setCanine(String canine) {
      this.canine = canine;
   }

   public String getPremolaire1() {
      return premolaire1;
   }

   public void setPremolaire1(String premolaire1) {
      this.premolaire1 = premolaire1;
   }

   public String getPremolaire2() {
      return premolaire2;
   }

   public void setPremolaire2(String premolaire2) {
      this.premolaire2 = premolaire2;
   }

   public String getMolaire1() {
      return molaire1;
   }

   public void setMolaire1(String molaire1) {
      this.molaire1 = molaire1;
   }

   public String getMolaire2() {
      return molaire2;
   }

   public void setMolaire2(String molaire2) {
      this.molaire2 = molaire2;
   }

   public String getMolaire3() {
      return molaire3;
   }

   public void setMolaire3(String molaire3) {
      this.molaire3 = molaire3;
   }

   public String getMotifConsultation() {
      return motifConsultation;
   }

   public void setMotifConsultation(String motifConsultation) {
      this.motifConsultation = motifConsultation;
   }

   public Date getDateConsultation() {
      return dateConsultation;
   }

   public void setDateConsultation(Date dateConsultation) {
      this.dateConsultation = dateConsultation;
   }
}