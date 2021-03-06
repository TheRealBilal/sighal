package applimedical.sighal.api.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import applimedical.sighal.api.constantes.EtatRdvEnum;
import applimedical.sighal.pojo.BasePojo;

@Entity
@Table(name = "rendez_vous")
public class RendezVous extends BasePojo {

	@Column (name ="date_prise_rdv")
	@Temporal(TemporalType.TIMESTAMP)
	private Date datePriseRdv;

	@Column (name= "date_rdv")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateRdv;

	@OneToOne()
	@JoinColumn(name = "patient_id", referencedColumnName = "id" , nullable= false)
	private Patient patient;

   @ManyToMany(fetch=FetchType.LAZY)
   @JoinTable(
         name="personnel_rendez_vous",
         joinColumns={@JoinColumn(name="rendez_vous_id", referencedColumnName="id")},
         inverseJoinColumns={@JoinColumn(name="personne_id", referencedColumnName="id")}
         )
   private List<Personnel> personnelList;

	@ManyToOne
	@JoinColumn(name = "arrange_par", referencedColumnName = "id" , nullable= false)
	private Personnel personnel;

	@OneToOne(mappedBy = "rendezVous")
	private Intervention intervention;

	@ManyToOne()
	@JoinColumn(name = "salle_id", referencedColumnName = "id" , nullable= false)
	private Salle salle;
	
	@Enumerated(EnumType.ORDINAL)
	private EtatRdvEnum etat;

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

   public List<Personnel> getPersonnelList() {
      return personnelList;
   }

   public void setPersonnelList(List<Personnel> personnelList) {
      this.personnelList = personnelList;
   }

   public Patient getPatient() {
      return patient;
   }

   public void setPatient(Patient patient) {
      this.patient = patient;
   }

   public Personnel getPersonnel() {
      return personnel;
   }

   public void setPersonnel(Personnel personnel) {
      this.personnel = personnel;
   }

   public Intervention getIntervention() {
      return intervention;
   }

   public void setIntervention(Intervention intervention) {
      this.intervention = intervention;
   }

   public Salle getSalle() {
      return salle;
   }

   public void setSalle(Salle salle) {
      this.salle = salle;
   }

   public EtatRdvEnum getEtat() {
      return etat;
   }

   public void setEtat(EtatRdvEnum etat) {
      this.etat = etat;
   }
}