package applimedical.sighal.api.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "dossier_patient")
public class DossierPatient {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dossier_patient_id")
	private Long dossierPatientId;

	@Column(name = "date_creation")
	private Date dateCreation;

	@Column(name = "date_modification")
	private Date dateModification;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "dossierPatient", fetch=FetchType.LAZY)
   private List<FichePatient> fichePatientList;

   @OneToOne(mappedBy="dossierPatient")
   private Patient patient;

   @ManyToOne()
   @JoinColumn(name="personnel_id", referencedColumnName="personne_id")
   private Personnel personnel;

   public Long getDossierPatientId() {
      return dossierPatientId;
   }

   public void setDossierPatientId(Long dossierPatientId) {
      this.dossierPatientId = dossierPatientId;
   }

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