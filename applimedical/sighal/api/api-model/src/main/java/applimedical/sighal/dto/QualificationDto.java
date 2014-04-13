package applimedical.sighal.dto;

import java.util.List;

public class QualificationDto {

   private Long qualificationId;

   private String description;

   private String descriptionLong;

   private Integer nbAnneeExperience;

   private List<PersonnelDto> personnelDtoList;

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

   public List<PersonnelDto> getPersonnelDtoList() {
      return personnelDtoList;
   }

   public void setPersonnelDtoList(List<PersonnelDto> personnelDtoList) {
      this.personnelDtoList = personnelDtoList;
   }
}