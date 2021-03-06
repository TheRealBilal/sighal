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
@Table(name = "cim_sous_catgorie")
public class CimSousCategorie extends BasePojo {

   @Column(name = "num_sous_categorie")
   private int numSousCategorie;
   @Column(name = "libl")
   private String liblCategorie;
   @Column(name = "description")
   private String desc;
   @ManyToOne
   @JoinColumn(name = "code_categorie", referencedColumnName = "code_categorie")
   private CimCategorie cimCategorie;
   @OneToMany(cascade = { javax.persistence.CascadeType.ALL }, mappedBy = "cimSousCategorie", fetch = FetchType.LAZY)
   private List<CimSousDivis> cimSousDivis;

   public int getNumSousCategorie() {
      return this.numSousCategorie;
   }

   public void setNumSousCategorie(int numSousCategorie) {
      this.numSousCategorie = numSousCategorie;
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

   public CimCategorie getCimCategorie() {
      return this.cimCategorie;
   }

   public void setCimCategorie(CimCategorie cimCategorie) {
      this.cimCategorie = cimCategorie;
   }

   public List<CimSousDivis> getCimSousDivis() {
      return this.cimSousDivis;
   }

   public void setCimSousDivis(List<CimSousDivis> cimSousDivis) {
      this.cimSousDivis = cimSousDivis;
   }
}
