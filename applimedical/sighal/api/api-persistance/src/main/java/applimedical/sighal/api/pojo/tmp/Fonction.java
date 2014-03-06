package applimedical.sighal.api.pojo.tmp;
/***********************************************************************
 * Module:  Fonction.java
 * Author:  HAZEM
 * Purpose: Defines the Class Fonction
 ***********************************************************************/

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*reste les jointure avec personne et service et permission*/

@Entity
@Table(name = "fonction")
public class Fonction {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "code_fonction")
   private int codeFonction;
   
	@Column(name = "nom_fonction")
   private String nomFonction;
   
	@Column(name = "description")
   private String description;
   
	@Column(name = "active")
   private boolean active;

}