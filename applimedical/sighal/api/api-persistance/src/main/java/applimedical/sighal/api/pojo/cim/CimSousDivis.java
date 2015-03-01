package applimedical.sighal.api.pojo.cim;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import applimedical.sighal.pojo.BasePojo;

@Entity
@Table(name = "cim_sous_divis")
public class CimSousDivis extends BasePojo {

   @Column(name = "num_sous_divis")
   private int numSousdivis;

   @Column(name = "libl")
   private String liblCategorie;

   @Column(name = "description")
   private String desc;

   @ManyToOne
   @JoinColumn(name = "num_sous_categorie", referencedColumnName = "num_sous_categorie")
   private CimSousCategorie cimSousCategorie;

   public int getNumSousdivis() {
      return this.numSousdivis;
   }

   public void setNumSousdivis(int numSousdivis) {
      this.numSousdivis = numSousdivis;
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

   public CimSousCategorie getCimSousCategorie() {
      return this.cimSousCategorie;
   }

   public void setCimSousCategorie(CimSousCategorie cimSousCategorie) {
      this.cimSousCategorie = cimSousCategorie;
   }
}
