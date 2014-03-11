package applimedical.sighal.api.pojo;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "personnel")
public class Personnel extends Personne {
   @Column()
   private String matricule;

   @Column(name = "date_embauche")
   private Date dateEmbauche;

   @Column()
   private Integer experience;

   @Column()
   private Double salaire;

   @ManyToOne()
   @JoinColumn(name = "service_id", referencedColumnName = "service_id")
   private Service service;

   @ManyToMany(fetch=FetchType.LAZY)
   @JoinTable(
         name="personnel_qualification",
         joinColumns={@JoinColumn(name="personne_id", referencedColumnName="personne_id")},
         inverseJoinColumns={@JoinColumn(name="qualification_id", referencedColumnName="qualification_id")}
   )
   private Collection<Qualification> qualificationList;

   public Collection<Qualification> getQualificationList() {
      return qualificationList;
   }

   public void setQualificationList(Collection<Qualification> qualificationList) {
      this.qualificationList = qualificationList;
   }

   public Service getService() {
      return service;
   }

   public void setService(Service service) {
      this.service = service;
   }

   public String getMatricule() {
      return matricule;
   }

   public void setMatricule(String matricule) {
      this.matricule = matricule;
   }

   public Date getDateEmbauche() {
      return dateEmbauche;
   }

   public void setDateEmbauche(Date dateEmbauche) {
      this.dateEmbauche = dateEmbauche;
   }

   public Integer getExperience() {
      return experience;
   }

   public void setExperience(Integer experience) {
      this.experience = experience;
   }

   public Double getSalaire() {
      return salaire;
   }

   public void setSalaire(Double salaire) {
      this.salaire = salaire;
   }
   
   public static <From, To> To test (Class<To> cl,From entity){
	   
	   try {
		To toto = cl.newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	   
   }
}