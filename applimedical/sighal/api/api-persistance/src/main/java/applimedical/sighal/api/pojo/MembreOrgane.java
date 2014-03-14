package applimedical.sighal.api.pojo;
/***********************************************************************
 * Module:  membre_organe_.java
 * Author:  HAZEM
 * Purpose: Defines the Class membre_organe_
 ***********************************************************************/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "membre_organe")
public class MembreOrgane {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="organe_id")
	private Long organeId;
	
	@ManyToOne
	private Soin soin;
}