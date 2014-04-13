package applimedical.sighal.dto;

import java.util.List;

public class SalleDto {

   private Long salleId;

   private String nomSalle;

   private List<RendezVousDto> rendezVousDtoList;
   
   public Long getSalleId() {
      return salleId;
   }

   public void setSalleId(Long salleId) {
      this.salleId = salleId;
   }

   public String getNomSalle() {
      return nomSalle;
   }

   public void setNomSalle(String nomSalle) {
      this.nomSalle = nomSalle;
   }

   public List<RendezVousDto> getRendezVousDtoList() {
      return rendezVousDtoList;
   }

   public void setRendezVousDtoList(List<RendezVousDto> rendezVousDtoList) {
      this.rendezVousDtoList = rendezVousDtoList;
   }
}