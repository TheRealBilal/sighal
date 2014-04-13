package applimedical.sighal.dto;

import java.util.List;

public class CategorieDto {
   private Long categorieId;
   
   private String nom;

   private String description;

   private List<SousCategorieDto> sousCategorieDtoList;

   public Long getCategorieId() {
      return categorieId;
   }

   public void setCategorieId(Long categorieId) {
      this.categorieId = categorieId;
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

   public List<SousCategorieDto> getSousCategorieDtoList() {
      return sousCategorieDtoList;
   }

   public void setSousCategorieDtoList(List<SousCategorieDto> sousCategorieDtoList) {
      this.sousCategorieDtoList = sousCategorieDtoList;
   }
}