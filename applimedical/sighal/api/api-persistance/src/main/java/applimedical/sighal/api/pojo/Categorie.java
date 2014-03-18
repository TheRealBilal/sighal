package applimedical.sighal.api.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "categorie_id")
   private Long categorieId;
   
   @Column()
   private String nom;

   @Column()
   private String description;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "categorie", fetch=FetchType.LAZY)
   private List<SousCategorie> sousCategorieList;

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

   public List<SousCategorie> getSousCategorieList() {
      return sousCategorieList;
   }

   public void setSousCategorieList(List<SousCategorie> sousCategorieList) {
      this.sousCategorieList = sousCategorieList;
   }
}