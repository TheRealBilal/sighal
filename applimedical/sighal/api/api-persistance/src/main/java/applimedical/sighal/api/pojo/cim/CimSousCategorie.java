package applimedical.sighal.api.pojo.cim;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cim_sous_catgorie")
public class CimSousCategorie
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="sous_categ_id")
  private Long sousCategorieId;
  @Column(name="num_sous_categorie")
  private int numSousCategorie;
  @Column(name="libl")
  private String liblCategorie;
  @Column(name="description")
  private String desc;
  @ManyToOne
  @JoinColumn(name="code_categorie", referencedColumnName="code_categorie")
  private CimCategorie cimCategorie;
  @OneToMany(cascade={javax.persistence.CascadeType.ALL}, mappedBy="cimSousCategorie", fetch=FetchType.LAZY)
  private List<CimSousDivis> cimSousDivis;
  
  public Long getSousCategorieId()
  {
    return this.sousCategorieId;
  }
  
  public void setSousCategorieId(Long sousCategorieId)
  {
    this.sousCategorieId = sousCategorieId;
  }
  
  public int getNumSousCategorie()
  {
    return this.numSousCategorie;
  }
  
  public void setNumSousCategorie(int numSousCategorie)
  {
    this.numSousCategorie = numSousCategorie;
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
  
  public CimCategorie getCimCategorie()
  {
    return this.cimCategorie;
  }
  
  public void setCimCategorie(CimCategorie cimCategorie)
  {
    this.cimCategorie = cimCategorie;
  }
  
  public List<CimSousDivis> getCimSousDivis()
  {
    return this.cimSousDivis;
  }
  
  public void setCimSousDivis(List<CimSousDivis> cimSousDivis)
  {
    this.cimSousDivis = cimSousDivis;
  }
}
