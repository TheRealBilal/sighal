package applimedical.sighal.dto;

import java.util.Date;
import java.util.List;

public class ProduitDto {
   private Long produitId;

   private String produitCode;

   private String nom;

   private String description;

   private Date dateFabrication;

   private Date dateExpiration;

   private Integer nombreUtilisation;

   private Integer quantite;

   private Integer stockAlert;

   private SousCategorieDto sousCategorieDto;

   private List<LigneSortieDto> ligneSortieDtoList;

   private List<LigneCommandeDto> ligneCommandeDtoList;

   public Long getProduitId() {
      return produitId;
   }

   public void setProduitId(Long produitId) {
      this.produitId = produitId;
   }

   public String getProduitCode() {
      return produitCode;
   }

   public void setProduitCode(String produitCode) {
      this.produitCode = produitCode;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Date getDateFabrication() {
      return dateFabrication;
   }

   public void setDateFabrication(Date dateFabrication) {
      this.dateFabrication = dateFabrication;
   }

   public Date getDateExpiration() {
      return dateExpiration;
   }

   public void setDateExpiration(Date dateExpiration) {
      this.dateExpiration = dateExpiration;
   }

   public Integer getNombreUtilisation() {
      return nombreUtilisation;
   }

   public void setNombreUtilisation(Integer nombreUtilisation) {
      this.nombreUtilisation = nombreUtilisation;
   }

   public Integer getQuantite() {
      return quantite;
   }

   public void setQuantite(Integer quantite) {
      this.quantite = quantite;
   }

   public Integer getStockAlert() {
      return stockAlert;
   }

   public void setStockAlert(Integer stockAlert) {
      this.stockAlert = stockAlert;
   }

   public SousCategorieDto getSousCategorieDto() {
      return sousCategorieDto;
   }

   public void setSousCategorieDto(SousCategorieDto sousCategorieDto) {
      this.sousCategorieDto = sousCategorieDto;
   }

   public List<LigneCommandeDto> getLigneCommandeDtoList() {
      return ligneCommandeDtoList;
   }

   public void setLigneCommandeDtoList(List<LigneCommandeDto> ligneCommandeDtoList) {
      this.ligneCommandeDtoList = ligneCommandeDtoList;
   }

   public List<LigneSortieDto> getLigneSortieDtoList() {
      return ligneSortieDtoList;
   }

   public void setLigneSortieDtoList(List<LigneSortieDto> ligneSortieDtoList) {
      this.ligneSortieDtoList = ligneSortieDtoList;
   }
}