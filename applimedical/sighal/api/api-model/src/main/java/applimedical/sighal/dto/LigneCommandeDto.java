package applimedical.sighal.dto;

public class LigneCommandeDto {

   private Long ligneCommandeId;

   private CommandeDto commandeDto;

   private ProduitDto produitDto;

   private Integer quantite;

   private Double prix;

   public Long getLigneCommandeId() {
      return ligneCommandeId;
   }

   public void setLigneCommandeId(Long ligneCommandeId) {
      this.ligneCommandeId = ligneCommandeId;
   }

   public CommandeDto getCommandeDto() {
      return commandeDto;
   }

   public void setCommandeDto(CommandeDto commandeDto) {
      this.commandeDto = commandeDto;
   }

   public ProduitDto getProduitDto() {
      return produitDto;
   }

   public void setProduitDto(ProduitDto produitDto) {
      this.produitDto = produitDto;
   }

   public Integer getQuantite() {
      return quantite;
   }

   public void setQuantite(Integer quantite) {
      this.quantite = quantite;
   }

   public Double getPrix() {
      return prix;
   }

   public void setPrix(Double prix) {
      this.prix = prix;
   }
}