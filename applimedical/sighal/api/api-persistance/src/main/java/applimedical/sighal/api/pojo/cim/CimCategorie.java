package applimedical.sighal.api.pojo.cim;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import applimedical.sighal.pojo.BasePojo;

@Entity
@Table(name = "cim_catgorie")
public class CimCategorie extends BasePojo {

   @Column(name = "code_categorie")
   private String codeCategorie;

   @Column(name = "libl")
   private String liblCategorie;

   @Column(name = "description")
   private String desc;

   @ManyToOne
   @JoinColumn(name = "sous_chapitre_id", referencedColumnName = "sous_chapitre_id")
   private CimSousChapitre sousChapitre;

   @OneToMany(cascade = { javax.persistence.CascadeType.ALL }, mappedBy = "cimCategorie", fetch = FetchType.LAZY)
   private List<CimSousCategorie> cimSousCategorieList;

   public String getCodeCategorie() {
      return this.codeCategorie;
   }

   public void setCodeCategorie(String codeCategorie) {
      this.codeCategorie = codeCategorie;
   }

   public String getLiblCategorie() {
      return this.liblCategorie;
   }

   public void setLiblCategorie(String liblCategorie) {
      this.liblCategorie = liblCategorie;
   }

   public String getDesc() {
      return this.desc;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }

   public CimSousChapitre getSousChapitre() {
      return this.sousChapitre;
   }

   public void setSousChapitre(CimSousChapitre sousChapitre) {
      this.sousChapitre = sousChapitre;
   }

   public List<CimSousCategorie> getCimSousCategorieList() {
      return this.cimSousCategorieList;
   }

   public void setCimSousCategorieList(
         List<CimSousCategorie> cimSousCategorieList) {
      this.cimSousCategorieList = cimSousCategorieList;
   }
}
