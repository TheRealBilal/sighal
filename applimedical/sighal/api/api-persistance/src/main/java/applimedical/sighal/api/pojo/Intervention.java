package applimedical.sighal.api.pojo;
/***********************************************************************
 * Module:  Intervention.java
 * Author:  HAZEM
 * Purpose: Defines the Class Intervention
 ***********************************************************************/

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	   @Column(name = "id_interv")
   private int idInterv;
   
	@Column(name = "date_interv")
   private java.util.Date dateInterv;
   
	@Column(name = "duree_interv")
   private int dureeInterv;
   
	@Column(name = "type_interv")
   private TypeIntervention typeInterv;
   
	@Column(name = "desc_interv")
   private String descInterv;

	@ManyToOne()
   @JoinColumn(name = "type_intervention_id", referencedColumnName = "type_intervention_id")
   private TypeIntervention typeIntervention;
	

}