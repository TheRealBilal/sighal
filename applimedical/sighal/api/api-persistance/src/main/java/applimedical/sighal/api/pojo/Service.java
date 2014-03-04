package applimedical.sighal.api.pojo;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "service")
public class Service {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "service_id")
   private Long serviceId;

   public Long getServiceId() {
      return serviceId;
   }

   public void setServiceId(Long serviceId) {
      this.serviceId = serviceId;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Date getDateOuverture() {
      return dateOuverture;
   }

   public void setDateOuverture(Date dateOuverture) {
      this.dateOuverture = dateOuverture;
   }

   public Collection<Personnel> getPersonnelList() {
      return personnelList;
   }

   public void setPersonnelList(Collection<Personnel> personnelList) {
      this.personnelList = personnelList;
   }

   public Personnel getChefService() {
      return chefService;
   }

   public void setChefService(Personnel chefService) {
      this.chefService = chefService;
   }

   @Column(name ="nom")
   private String nom;

   @Column(name ="description")
   private String description;

   @Column(name ="date_ouverture")
   private Date dateOuverture;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "service", fetch=FetchType.LAZY)
   private Collection<Personnel> personnelList;
   
   @OneToOne()
   @JoinColumn(name = "chef_service_id", referencedColumnName = "personne_id")
   private Personnel chefService;
}