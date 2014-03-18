package applimedical.sighal.api.pojo;
/***********************************************************************
 * Module:  Intervention.java
 * Author:  HAZEM
 * Purpose: Defines the Class Intervention
 ***********************************************************************/

import java.util.*;

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

/*
 * reste liaison avec intervenant salle type intervention rdv et fiche patient 
 * 
 */
@Entity
@Table(name = "Intervention")
public class Intervention {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "intervention_id")
	private Long interventionId;

	@Column(name = "date_intervention")
	private Date dateIntervention;

	@Column(name = "duree_intervention")
	private Integer dureeIntervention;

	@Column(name = "description")
	private String description;

	@ManyToOne()
	@JoinColumn(name = "type_intervention_id", referencedColumnName = "type_intervention_id")
	private TypeIntervention typeIntervention;

	@ManyToOne()
	@JoinColumn(name = "fiche_patient_id", referencedColumnName = "fiche_patient_id")
	private FichePatient fichePatient;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "intervention", fetch=FetchType.LAZY)
   private List<Soin> soinList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "intervention", fetch=FetchType.LAZY)
   private List<LigneSortie> ligneSortieList;

	@OneToOne
	@JoinColumn(name="rendez_vous_id", referencedColumnName="rendez_vous_id")
	private RendezVous rendezVous;

   public Long getInterventionId() {
      return interventionId;
   }

   public void setInterventionId(Long interventionId) {
      this.interventionId = interventionId;
   }

   public Date getDateIntervention() {
      return dateIntervention;
   }

   public void setDateIntervention(Date dateIntervention) {
      this.dateIntervention = dateIntervention;
   }

   public Integer getDureeIntervention() {
      return dureeIntervention;
   }

   public void setDureeIntervention(Integer dureeIntervention) {
      this.dureeIntervention = dureeIntervention;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public TypeIntervention getTypeIntervention() {
      return typeIntervention;
   }

   public void setTypeIntervention(TypeIntervention typeIntervention) {
      this.typeIntervention = typeIntervention;
   }

   public FichePatient getFichePatient() {
      return fichePatient;
   }

   public void setFichePatient(FichePatient fichePatient) {
      this.fichePatient = fichePatient;
   }

   public List<Soin> getSoinList() {
      return soinList;
   }

   public void setSoinList(List<Soin> soinList) {
      this.soinList = soinList;
   }

   public List<LigneSortie> getLigneSortieList() {
      return ligneSortieList;
   }

   public void setLigneSortieList(List<LigneSortie> ligneSortieList) {
      this.ligneSortieList = ligneSortieList;
   }

   public RendezVous getRendezVous() {
      return rendezVous;
   }

   public void setRendezVous(RendezVous rendezVous) {
      this.rendezVous = rendezVous;
   }
}