package applimedical.sighal.api.pojo;
/***********************************************************************
 * Module:  Intervenant.java
 * Author:  HAZEM
 * Purpose: Defines the Class Intervenant
 ***********************************************************************/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

//@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Intervenant extends Personnel {

	@Id
	@Column (name = "intervenant_id")
	@JoinColumn(name="intervenant_id", table="personnel", referencedColumnName="personne_id")
	private Long intervenantId;
}