package applimedical.sighal.dto;

import java.util.List;

public class SalleDto {

   private Long salleId;

   private String codeSalle;

   private String nomSalle;

   private String decriptionSalle;

   private String commentarySalle;

   private List<RendezVousDto> rendezVousDtoList;
   
   public Long getSalleId() {
      return salleId;
   }

   public void setSalleId(Long salleId) {
      this.salleId = salleId;
   }

   public String getCodeSalle() {
      return codeSalle;
   }

   public void setCodeSalle(String codeSalle) {
      this.codeSalle = codeSalle;
   }

   public String getNomSalle() {
      return nomSalle;
   }

   public void setNomSalle(String nomSalle) {
      this.nomSalle = nomSalle;
   }

   public String getDecriptionSalle() {
      return decriptionSalle;
   }

   public void setDecriptionSalle(String decriptionSalle) {
      this.decriptionSalle = decriptionSalle;
   }

   public String getCommentarySalle() {
      return commentarySalle;
   }

   public void setCommentarySalle(String commentarySalle) {
      this.commentarySalle = commentarySalle;
   }

   public List<RendezVousDto> getRendezVousDtoList() {
      return rendezVousDtoList;
   }

   public void setRendezVousDtoList(List<RendezVousDto> rendezVousDtoList) {
      this.rendezVousDtoList = rendezVousDtoList;
   }
}