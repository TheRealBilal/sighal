package applimedical.sighal.api.pojo;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "produit_id")
   private Long produitId;

   @Column(name = "produit_code")
   private int produitCode;

   @Column()
   private String nom;

   @Column()
   private String description;

   @Column(name = "date_fabrication")
   private Date dateFabrication;

   @Column(name = "date_expiration")
   private Date dateExpiration;

   @Column(name = "nombre_utilisation")
   private Integer nombreUtilisation;

   @Column()
   private Integer quantite;

   @Column(name = "stock_alert")
   private Integer stockAlert;

   @ManyToOne()
   @JoinColumn(name = "sous_categorie_id", referencedColumnName = "sous_categorie_id")
   private SousCategorie sousCategorie;

   @OneToMany()
   private Collection<LigneCommande> ligneCommandeList;

   public Long getProduitId() {
      return produitId;
   }

   public void setProduitId(Long produitId) {
      this.produitId = produitId;
   }

   public int getProduitCode() {
      return produitCode;
   }

   public void setProduitCode(int produitCode) {
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

   public SousCategorie getSousCategorie() {
      return sousCategorie;
   }

   public void setSousCategorie(SousCategorie sousCategorie) {
      this.sousCategorie = sousCategorie;
   }

   public Collection<LigneCommande> getLigneCommandeList() {
      return ligneCommandeList;
   }

   public void setLigneCommandeList(Collection<LigneCommande> ligneCommandeList) {
      this.ligneCommandeList = ligneCommandeList;
   }
}