package applimedical.sighal.api.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sous_categorie")
public class SousCategorie {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "sous_categorie_id")
   private Long sousCategorieId;

   @Column()
   private String nom;

   @Column()
   private String description;

   @ManyToOne()
   @JoinColumn(name = "categorie_id", referencedColumnName = "categorie_id")
   private Categorie categorie;

   public Long getSousCategorieId() {
      return sousCategorieId;
   }

   public void setSousCategorieId(Long sousCategorieId) {
      this.sousCategorieId = sousCategorieId;
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

   public Categorie getCategorie() {
      return categorie;
   }

   public void setCategorie(Categorie categorie) {
      this.categorie = categorie;
   }
}