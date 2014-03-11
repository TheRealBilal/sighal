package applimedical.sighal.api.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import applimedical.sighal.api.pojo.tmp.EtatRdvEnum;

@Table(name = "rdv")
public class Rdv {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name = "rdv_id")
	private Long rdvId;

	@Column (name ="date_prise_rdv")
	@Temporal(TemporalType.TIMESTAMP)
	private Date datePriseRdv;

	@Column (name= "date_rdv")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateRdv;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "intervenant_id", fetch=FetchType.LAZY)
	private Set<Intervenant> listIntervenant;

	@OneToOne()
	@JoinColumn(name = "patient_id", referencedColumnName = "personne_id" , nullable= false)
	private Patient patient;
	
	@OneToOne()
	@JoinColumn(name = "personnel_id", referencedColumnName = "personne_id" , nullable= false)
	private Personnel personnel;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "id_interv", fetch=FetchType.LAZY)
	private Set<Intervention> listIntervention;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "num_salle", fetch=FetchType.LAZY)
	private Set<Salle> listSalle;
	
	
	private EtatRdvEnum etat;


	public Long getRdvId() {
		return rdvId;
	}


	public void setRdvId(Long rdvId) {
		this.rdvId = rdvId;
	}


	public Date getDatePriseRdv() {
		return datePriseRdv;
	}


	public void setDatePriseRdv(Date datePriseRdv) {
		this.datePriseRdv = datePriseRdv;
	}


	public Date getDateRdv() {
		return dateRdv;
	}


	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}


	public EtatRdvEnum getEtat() {
		return etat;
	}


	public void setEtat(EtatRdvEnum etat) {
		this.etat = etat;
	}

	public List<Intervenant> getListIntervenant() {
		List<Intervenant> listInterv = new ArrayList<Intervenant>();
		for (Intervenant interv : listIntervenant) {
			listInterv.add(interv);
		}
		return listInterv;
	}


	public void setListIntervenantAsList(List<Intervenant> listInterv) {
		Set<Intervenant> listIntervenant = new HashSet<Intervenant>();
		for (Intervenant interv : listInterv) {
			listIntervenant.add(interv);
		}
		this.listIntervenant = listIntervenant;
	}

	public List<Intervention> getListIntervention() {
		List<Intervention> listInterv = new ArrayList<Intervention>();
		for (Intervention interv : listIntervention) {
			listInterv.add(interv);
		}
		return listInterv;
	}


	public void setListInterventiontAsList(List<Intervention> listInterv) {
		Set<Intervention> listIntervention = new HashSet<Intervention>();
		for (Intervention interv : listInterv) {
			listIntervention.add(interv);
		}
		this.listIntervention = listIntervention;
	}
	
	public List<Salle> getListSalle() {
		List<Salle> listSalle = new ArrayList<Salle>();
		for (Salle sal : listSalle) {
			listSalle.add(sal);
		}
		return listSalle;
	}


	public void setListSalleAsList(List<Salle> listSalle) {
		Set<Salle> listSal = new HashSet<Salle>();
		for (Salle interv : listSalle) {
			listSal.add(interv);
		}
		this.listSalle = listSal;
	}
}