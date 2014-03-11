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
import javax.persistence.Table;

@Entity
@Table(name = "intervenant")
public class Intervenant extends Personnel {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name = "intervenant_id")
	private Long intervenantId;
}