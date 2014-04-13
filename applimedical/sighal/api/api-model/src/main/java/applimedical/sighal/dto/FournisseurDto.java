package applimedical.sighal.dto;

import java.util.List;

public class FournisseurDto extends PersonneDto {

   private String raisonSocial;

   private String remarque;

   private List<CommandeDto> commandeDtoList;

   public String getRaisonSocial() {
      return raisonSocial;
   }

   public void setRaisonSocial(String raisonSocial) {
      this.raisonSocial = raisonSocial;
   }

   public String getRemarque() {
      return remarque;
   }

   public void setRemarque(String remarque) {
      this.remarque = remarque;
   }

   public List<CommandeDto> getCommandeDtoList() {
      return commandeDtoList;
   }

   public void setCommandeDtoList(List<CommandeDto> commandeDtoList) {
      this.commandeDtoList = commandeDtoList;
   }
}