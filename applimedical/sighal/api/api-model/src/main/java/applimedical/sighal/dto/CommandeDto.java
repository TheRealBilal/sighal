package applimedical.sighal.dto;

import java.util.Date;
import java.util.List;

public class CommandeDto {
   private Long commandeId;

   private Date dateComande;

   private Date dateEntreeSouhaitee;

   private List<BonEntreeDto> bonEntreeDtoList;

   private List<LigneCommandeDto> ligneCommandeDtoList;

   private FournisseurDto fournisseurDto;

   public Long getCommandeId() {
      return commandeId;
   }

   public void setCommandeId(Long commandeId) {
      this.commandeId = commandeId;
   }

   public Date getDateComande() {
      return dateComande;
   }

   public void setDateComande(Date dateComande) {
      this.dateComande = dateComande;
   }

   public Date getDateEntreeSouhaitee() {
      return dateEntreeSouhaitee;
   }

   public void setDateEntreeSouhaitee(Date dateEntreeSouhaitee) {
      this.dateEntreeSouhaitee = dateEntreeSouhaitee;
   }

   public List<BonEntreeDto> getBonEntreeDtoList() {
      return bonEntreeDtoList;
   }

   public void setBonEntreeDtoList(List<BonEntreeDto> bonEntreeDtoList) {
      this.bonEntreeDtoList = bonEntreeDtoList;
   }

   public List<LigneCommandeDto> getLigneCommandeDtoList() {
      return ligneCommandeDtoList;
   }

   public void setLigneCommandeDtoList(List<LigneCommandeDto> ligneCommandeDtoList) {
      this.ligneCommandeDtoList = ligneCommandeDtoList;
   }

   public FournisseurDto getFournisseurDto() {
      return fournisseurDto;
   }

   public void setFournisseurDto(FournisseurDto fournisseurDto) {
      this.fournisseurDto = fournisseurDto;
   }
}