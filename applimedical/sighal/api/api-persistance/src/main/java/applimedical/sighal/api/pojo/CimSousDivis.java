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
@Table(name="cim_sous_divis")
public class CimSousDivis
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="sous_divis_id")
  private Long sousCategorieId;
  @Column(name="num_sous_divis")
  private int numSousdivis;
  @Column(name="libl")
  private String liblCategorie;
  @Column(name="description")
  private String desc;
  @ManyToOne
  @JoinColumn(name="num_sous_categorie", referencedColumnName="num_sous_categorie")
  private CimSousCategorie cimSousCategorie;
  
  public Long getSousCategorieId()
  {
    return this.sousCategorieId;
  }
  
  public void setSousCategorieId(Long sousCategorieId)
  {
    this.sousCategorieId = sousCategorieId;
  }
  
  public int getNumSousdivis()
  {
    return this.numSousdivis;
  }
  
  public void setNumSousdivis(int numSousdivis)
  {
    this.numSousdivis = numSousdivis;
  }
  
  public String getLiblCategorie()
  {
    return this.liblCategorie;
  }
  
  public void setLiblCategorie(String liblCategorie)
  {
    this.liblCategorie = liblCategorie;
  }
  
  public String getDesc()
  {
    return this.desc;
  }
  
  public void setDesc(String desc)
  {
    this.desc = desc;
  }
  
  public CimSousCategorie getCimSousCategorie()
  {
    return this.cimSousCategorie;
  }
  
  public void setCimSousCategorie(CimSousCategorie cimSousCategorie)
  {
    this.cimSousCategorie = cimSousCategorie;
  }
}
