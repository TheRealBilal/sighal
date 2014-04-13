package applimedical.sighal.dto;

import java.util.Date;

public class FichePatientDentaireDto extends FichePatientDto {

	private String incisivCentrale;

	private String incisivLaterale;

	private String canine;

	private String premolaire1;

	private String premolaire2;

	private String molaire1;

	private String molaire2;

	private String molaire3;

	private String motifConsultation;

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