package applimedical.sighal.api.pojo;
/***********************************************************************
 * Module:  membre_organe_.java
 * Author:  HAZEM
 * Purpose: Defines the Class membre_organe_
 ***********************************************************************/

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "membre_organe")
public class MembreOrgane implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4644774829450498276L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="organe_id")
	private Long organeId;
	
	@ManyToOne
	@JoinColumn (name ="soin_id", referencedColumnName= "soin_id")
	private Soin soin;

	public Long getOrganeId() {
		return organeId;
	}

	public void setOrganeId(Long organeId) {
		this.organeId = organeId;
	}

	public Soin getSoin() {
		return soin;
	}

	public void setSoin(Soin soin) {
		this.soin = soin;
	}
	
	
}