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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import applimedical.sighal.pojo.BasePojo;

/*
 * reste liaison avec intervenant salle type intervention rdv et fiche patient 
 * 
 */
@Entity
@Table(name = "Intervention")
public class Intervention extends BasePojo {

	@Column(name = "date_intervention")
	private Date dateIntervention;

	@Column(name = "duree_intervention")
	private Integer dureeIntervention;

	@Column(name = "description")
	private String description;
	
	@Column(name = "tension")
	private Float tension;

	@Column(name = "poids")
	private Float poids;
	
	@Column(name = "motif_consultation")
	private String motif_consultation;
	
	@Column(name = "evolution")
	private String evolution;

	@ManyToOne()
	@JoinColumn(name = "type_intervention_id", referencedColumnName = "id")
	private TypeIntervention typeIntervention;

	@ManyToOne()
	@JoinColumn(name = "fiche_patient_id", referencedColumnName = "id")
	private FichePatient fichePatient;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "intervention", fetch=FetchType.LAZY)
   private List<Soin> soinList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "intervention", fetch=FetchType.LAZY)
   private List<LigneSortie> ligneSortieList;

	@OneToOne
	@JoinColumn(name="rendez_vous_id", referencedColumnName="id")
	private RendezVous rendezVous;

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

   public Float getTension() {
	return tension;
}

public void setTension(Float tension) {
	this.tension = tension;
}

public Float getPoids() {
	return poids;
}

public void setPoids(Float poids) {
	this.poids = poids;
}

public String getMotif_consultation() {
	return motif_consultation;
}

public void setMotif_consultation(String motif_consultation) {
	this.motif_consultation = motif_consultation;
}

public String getEvolution() {
	return evolution;
}

public void setEvolution(String evolution) {
	this.evolution = evolution;
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