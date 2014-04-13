package applimedical.sighal.dto;

import java.util.List;

public class PatientDto extends PersonneDto {
   private String matricule;

   private Double poid;

   private Double taille;

   private Boolean antecedents;

   private String commentaire;

   private List<RendezVousDto> rendezVousDtoList;

   private DossierPatientDto dossierPatientDto;

   private CommandeDto commandeDto;

   public String getMatricule() {
      return matricule;
   }

   public void setMatricule(String matricule) {
      this.matricule = matricule;
   }

   public Double getPoid() {
      return poid;
   }

   public void setPoid(Double poid) {
      this.poid = poid;
   }

   public Double getTaille() {
      return taille;
   }

   public void setTaille(Double taille) {
      this.taille = taille;
   }

   public Boolean getAntecedents() {
      return antecedents;
   }

   public void setAntecedents(Boolean antecedents) {
      this.antecedents = antecedents;
   }

   public String getCommentaire() {
      return commentaire;
   }

   public void setCommentaire(String commentaire) {
      this.commentaire = commentaire;
   }

   public List<RendezVousDto> getRendezVousDtoList() {
      return rendezVousDtoList;
   }

   public void setRendezVousDtoList(List<RendezVousDto> rendezVousDtoList) {
      this.rendezVousDtoList = rendezVousDtoList;
   }

   public DossierPatientDto getDossierPatientDto() {
      return dossierPatientDto;
   }

   public void setDossierPatientDto(DossierPatientDto dossierPatientDto) {
      this.dossierPatientDto = dossierPatientDto;
   }

   public CommandeDto getCommandeDto() {
      return commandeDto;
   }

   public void setCommandeDto(CommandeDto commandeDto) {
      this.commandeDto = commandeDto;
   }
}