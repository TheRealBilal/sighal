package applimedical.sighal.dto;

import java.util.Date;
import java.util.List;

public class DossierPatientDto {

	private Long dossierPatientId;

	private Date dateCreation;

	private Date dateModification;

   private List<FichePatientDto> fichePatientDtoList;

   private PatientDto patientDto;

   private PersonnelDto personnelDto;

   public Long getDossierPatientId() {
      return dossierPatientId;
   }

   public void setDossierPatientId(Long dossierPatientId) {
      this.dossierPatientId = dossierPatientId;
   }

   public Date getDateCreation() {
      return dateCreation;
   }

   public void setDateCreation(Date dateCreation) {
      this.dateCreation = dateCreation;
   }

   public Date getDateModification() {
      return dateModification;
   }

   public void setDateModification(Date dateModification) {
      this.dateModification = dateModification;
   }

   public List<FichePatientDto> getFichePatientDtoList() {
      return fichePatientDtoList;
   }

   public void setFichePatientDtoList(List<FichePatientDto> fichePatientDtoList) {
      this.fichePatientDtoList = fichePatientDtoList;
   }

   public PatientDto getPatientDto() {
      return patientDto;
   }

   public void setPatientDto(PatientDto patientDto) {
      this.patientDto = patientDto;
   }

   public PersonnelDto getPersonnelDto() {
      return personnelDto;
   }

   public void setPersonnelDto(PersonnelDto personnelDto) {
      this.personnelDto = personnelDto;
   }

}