package applimedical.sighal.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "qualification")
public class Qualification {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "qualification_id")
   private Long qualificationId;

   @Column()
   private String description;

   @Column(name = "description_long")
   private String descriptionLong;

   @Column(name = "nb_annee_experience")
   private Integer nbAnneeExperience;

   @ManyToMany(fetch=FetchType.LAZY, mappedBy="qualificationList")
   private List<Personnel> personnelList;

   public Long getQualificationId() {
      return qualificationId;
   }

   public void setQualificationId(Long qualificationId) {
      this.qualificationId = qualificationId;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public String getDescriptionLong() {
      return descriptionLong;
   }

   public void setDescriptionLong(String descriptionLong) {
      this.descriptionLong = descriptionLong;
   }

   public Integer getNbAnneeExperience() {
      return nbAnneeExperience;
   }

   public void setNbAnneeExperience(Integer nbAnneeExperience) {
      this.nbAnneeExperience = nbAnneeExperience;
   }

   public List<Personnel> getPersonnelList() {
      return personnelList;
   }

   public void setPersonnelList(List<Personnel> personnelList) {
      this.personnelList = personnelList;
   }
}