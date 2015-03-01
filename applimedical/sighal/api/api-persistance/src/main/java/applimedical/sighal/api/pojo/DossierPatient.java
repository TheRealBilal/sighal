package applimedical.sighal.api.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import applimedical.sighal.pojo.BasePojo;


@Entity
@Table(name = "dossier_patient")
public class DossierPatient extends BasePojo {

	@Column(name = "date_creation")
	private Date dateCreation;

	@Column(name = "date_modification")
	private Date dateModification;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "dossierPatient", fetch=FetchType.LAZY)
   private List<FichePatient> fichePatientList;

   @OneToOne(mappedBy="dossierPatient")
   private Patient patient;

   @ManyToOne()
   @JoinColumn(name="personnel_id", referencedColumnName="id")
   private Personnel personnel;

   public Date getDateCreation() {
      return dateCreation;
   }

   public void setDateCreation(Date dateCreation) {
      this.dateCreation = dateCreation;
   }

   public Date getDateModification() {
      return dateModification;
   }

   public void setDateModification(Date dateModification) {
      this.dateModification = dateModification;
   }

   public List<FichePatient> getFichePatientList() {
      return fichePatientList;
   }

   public void setFichePatientList(List<FichePatient> fichePatientList) {
      this.fichePatientList = fichePatientList;
   }

   public Patient getPatient() {
      return patient;
   }

   public void setPatient(Patient patient) {
      this.patient = patient;
   }

   public Personnel getPersonnel() {
      return personnel;
   }

   public void setPersonnel(Personnel personnel) {
      this.personnel = personnel;
   }

}