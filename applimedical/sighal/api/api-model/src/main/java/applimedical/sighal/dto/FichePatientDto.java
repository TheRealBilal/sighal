package applimedical.sighal.dto;

import java.util.Date;
import java.util.List;

import applimedical.sighal.api.constantes.TypeFichePatientEnum;

public class FichePatientDto {

	private Long fichePatientId;

	private Date dateCreation;
	
	private Date dateModification;
	
	private String observation;
	
	private String etatGeneraleActuelPatient;

	private String planTraitement;
	
   private DossierPatientDto dossierPatientDto;

   private TypeFichePatientEnum typeFichePatient;

   private List<InterventionDto> interventionDtoList;

   private PersonnelDto personnelDto;

   public Long getFichePatientId() {
      return fichePatientId;
   }

   public void setFichePatientId(Long fichePatientId) {
      this.fichePatientId = fichePatientId;
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

   public String getObservation() {
      return observation;
   }

   public void setObservation(String observation) {
      this.observation = observation;
   }

   public String getEtatGeneraleActuelPatient() {
      return etatGeneraleActuelPatient;
   }

   public void setEtatGeneraleActuelPatient(String etatGeneraleActuelPatient) {
      this.etatGeneraleActuelPatient = etatGeneraleActuelPatient;
   }

   public String getPlanTraitement() {
      return planTraitement;
   }

   public void setPlanTraitement(String planTraitement) {
      this.planTraitement = planTraitement;
   }

   public DossierPatientDto getDossierPatientDto() {
      return dossierPatientDto;
   }

   public void setDossierPatientDto(DossierPatientDto dossierPatientDto) {
      this.dossierPatientDto = dossierPatientDto;
   }

   public TypeFichePatientEnum getTypeFichePatient() {
      return typeFichePatient;
   }

   public void setTypeFichePatient(TypeFichePatientEnum typeFichePatient) {
      this.typeFichePatient = typeFichePatient;
   }

   public List<InterventionDto> getInterventionDtoList() {
      return interventionDtoList;
   }

   public void setInterventionDtoList(List<InterventionDto> interventionDtoList) {
      this.interventionDtoList = interventionDtoList;
   }

   public PersonnelDto getPersonnelDto() {
      return personnelDto;
   }

   public void setPersonnelDto(PersonnelDto personnelDto) {
      this.personnelDto = personnelDto;
   }
}