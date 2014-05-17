package applimedical.sighal.api.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Personne {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "personne_id")
   private Long personneId;

   @Column(name ="nom")
   private String nom;

   @Column(name ="nom_jeune_fille")
   private String nomJeuneFille;

   @Column(name ="prenom")
   private String prenom;

   @Column(name ="date_naissance")
   private Date dateNaissance;

   @Column(name ="sex")
   private Character sex;

   @Column(name ="titre")
   private Integer titre;

   @Column(name ="civilite")
   private Integer civilite;

   @Column(name ="adresse")
   private String adresse;

   @Column(name ="code_postale")
   private String codePostale;

   @Column(name ="ville")
   private String ville;

   @Column(name ="region")
   private String region;

   @Column(name ="pays")
   private String pays;

   @Column(name ="telephonne")
   private String telephonne;

   @Column(name ="email")
   private String email;

   @Column(name ="cin")
   private String cin;

   public Long getPersonneId() {
      return personneId;
   }

   public void setPersonneId(Long personneId) {
      this.personneId = personneId;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getNomJeuneFille() {
      return nomJeuneFille;
   }

   public void setNomJeuneFille(String nomJeuneFille) {
      this.nomJeuneFille = nomJeuneFille;
   }

   public String getPrenom() {
      return prenom;
   }

   public void setPrenom(String prenom) {
      this.prenom = prenom;
   }

   public Date getDateNaissance() {
      return dateNaissance;
   }

   public void setDateNaissance(Date dateNaissance) {
      this.dateNaissance = dateNaissance;
   }

   public Character getSex() {
      return sex;
   }

   public void setSex(Character sex) {
      this.sex = sex;
   }

   public Integer getTitre() {
      return titre;
   }

   public void setTitre(Integer titre) {
      this.titre = titre;
   }

   public Integer getCivilite() {
      return civilite;
   }

   public void setCivilite(Integer civilite) {
      this.civilite = civilite;
   }

   public String getAdresse() {
      return adresse;
   }

   public void setAdresse(String adresse) {
      this.adresse = adresse;
   }

   public String getCodePostale() {
      return codePostale;
   }

   public void setCodePostale(String codePostale) {
      this.codePostale = codePostale;
   }

   public String getVille() {
      return ville;
   }

   public void setVille(String ville) {
      this.ville = ville;
   }

   public String getRegion() {
      return region;
   }

   public void setRegion(String region) {
      this.region = region;
   }

   public String getPays() {
      return pays;
   }

   public void setPays(String pays) {
      this.pays = pays;
   }

   public String getTelephonne() {
      return telephonne;
   }

   public void setTelephonne(String telephonne) {
      this.telephonne = telephonne;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getCin() {
      return cin;
   }

   public void setCin(String cin) {
      this.cin = cin;
   }
}