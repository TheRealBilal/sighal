package applimedical.sighal.api.pojo;
/***********************************************************************
 * Module:  LigneSortie.java
 * Author:  HAZEM
 * Purpose: Defines the Class LigneSortie
 ***********************************************************************/

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* 
 * c'est une classe d'association liaison avec produit patient et personnel
 * plus une erreur car il trouve pas l'ID
 */


@Entity
@Table(name = "ligne_sorti")
public class LigneSortie {
   
	@Column(name = "quantite_sortie")
   private int quantiteSortie;
	
	@Column(name = "date_sortie")
   private java.util.Date dateSortie;

}