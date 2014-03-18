package applimedical.sighal.api.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import applimedical.sighal.api.constantes.TypeFichePatientEnum;

@Entity
@Table(name="fiche_patient")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
public class FichePatient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fiche_patient_id")
	private Long fichePatientId;
	
	@Column(name = "date_creation")
	private Date dateCreation;
	
	@Column(name = "date_modification")
	private Date dateModification;
	
	@Column(name = "observation")
	private String observation;
	
	@Column (name ="etat_generale_patient")
	private String etatGeneraleActuelPatient;

	@Column (name ="plan_traitement")
	private String planTraitement;
	
   @ManyToOne()
   @JoinColumn(name = "dossier_patient_id", referencedColumnName = "dossier_patient_id")
   private DossierPatient dossierPatient;

   @Enumerated(EnumType.ORDINAL)
   @Column(name="type_fiche_patient")
   private TypeFichePatientEnum typeFichePatient;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "fichePatient", fetch=FetchType.LAZY)
   public List<Intervention> interventionList;

   @ManyToOne()
   @JoinColumn(name = "personnel_id", referencedColumnName = "personne_id")
   private Personnel personnel;

   public Long getFichePatientId() {
      return fichePatientId;
   }

   public void setFichePatientId(Long fichePatientId) {
      this.fichePatientId = fichePatientId;
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

   public String getObservation() {
      return observation;
   }

   public void setObservation(String observation) {
      this.observation = observation;
   }

   public String getEtatGeneraleActuelPatient() {
      return etatGeneraleActuelPatient;
   }

   public void setEtatGeneraleActuelPatient(String etatGeneraleActuelPatient) {
      this.etatGeneraleActuelPatient = etatGeneraleActuelPatient;
   }

   public String getPlanTraitement() {
      return planTraitement;
   }

   public void setPlanTraitement(String planTraitement) {
      this.planTraitement = planTraitement;
   }

   public DossierPatient getDossierPatient() {
      return dossierPatient;
   }

   public void setDossierPatient(DossierPatient dossierPatient) {
      this.dossierPatient = dossierPatient;
   }

   public TypeFichePatientEnum getTypeFichePatient() {
      return typeFichePatient;
   }

   public void setTypeFichePatient(TypeFichePatientEnum typeFichePatient) {
      this.typeFichePatient = typeFichePatient;
   }

   public List<Intervention> getInterventionList() {
      return interventionList;
   }

   public void setInterventionList(List<Intervention> interventionList) {
      this.interventionList = interventionList;
   }

   public Personnel getPersonnel() {
      return personnel;
   }

   public void setPersonnel(Personnel personnel) {
      this.personnel = personnel;
   }
}