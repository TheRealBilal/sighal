package applimedical.sighal.dto;

import java.util.Date;

public class PersonneDto {

   private Long personneId;

   private String nom;

   private String nomJeuneFille;

   private String prenom;

   private Date dateNaissance;

   private Character sex;

   private Integer titre;

   private Integer civilite;

   private String adresse;

   private String codePostale;

   private String ville;

   private String region;

   private String pays;

   private String telephonne;

   private String email;

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
}