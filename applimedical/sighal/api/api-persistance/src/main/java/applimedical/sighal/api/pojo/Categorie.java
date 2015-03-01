package applimedical.sighal.api.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import applimedical.sighal.pojo.BasePojo;

@Entity
@Table(name = "categorie")
public class Categorie extends BasePojo {

   @Column()
   private String nom;

   @Column()
   private String description;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "categorie", fetch=FetchType.LAZY)
   private List<SousCategorie> sousCategorieList;

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