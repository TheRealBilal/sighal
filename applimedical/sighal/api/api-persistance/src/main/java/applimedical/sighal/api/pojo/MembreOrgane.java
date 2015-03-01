package applimedical.sighal.api.pojo;
/***********************************************************************
 * Module:  membre_organe_.java
 * Author:  HAZEM
 * Purpose: Defines the Class membre_organe_
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import applimedical.sighal.pojo.BasePojo;

@Entity
@Table(name = "membre_organe")
public class MembreOrgane extends BasePojo {
	
	@ManyToOne
	@JoinColumn (name ="soin_id", referencedColumnName= "id")
	private Soin soin;

	public Soin getSoin() {
		return soin;
	}

	public void setSoin(Soin soin) {
		this.soin = soin;
	}
	
	
}