package applimedical.sighal.dto;

import java.util.Date;

public class BonEntreeDto {

   private Long bonEntreeId;

   private Date dateEntree;

   private Double prixGlobal;

   private CommandeDto commandeDto;

   public Long getBonEntreeId() {
      return bonEntreeId;
   }
   public void setBonEntreeId(Long bonEntreeId) {
      this.bonEntreeId = bonEntreeId;
   }
   public Date getDateEntree() {
      return dateEntree;
   }
   public void setDateEntree(Date dateEntree) {
      this.dateEntree = dateEntree;
   }
   public Double getPrixGlobal() {
      return prixGlobal;
   }
   public void setPrixGlobal(Double prixGlobal) {
      this.prixGlobal = prixGlobal;
   }
   public CommandeDto getCommandeDto() {
      return commandeDto;
   }
   public void setCommandeDto(CommandeDto commandeDto) {
      this.commandeDto = commandeDto;
   }
}