package applimedical.sighal.api.pojo;

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
@Table(name="cim_catgorie")
public class CimCategorie
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="categ_id")
  private Long categorieId;
  @Column(name="code_categorie")
  private String codeCategorie;
  @Column(name="libl")
  private String liblCategorie;
  @Column(name="description")
  private String desc;
  @ManyToOne
  @JoinColumn(name="sous_chapitre_id", referencedColumnName="sous_chapitre_id")
  private SousChapitre sousChapitre;
  @OneToMany(cascade={javax.persistence.CascadeType.ALL}, mappedBy="cimCategorie", fetch=FetchType.LAZY)
  private List<CimSousCategorie> cimSousCategorieList;
  
  public Long getCategorieId()
  {
    return this.categorieId;
  }
  
  public void setCategorieId(Long categorieId)
  {
    this.categorieId = categorieId;
  }
  
  public String getCodeCategorie()
  {
    return this.codeCategorie;
  }
  
  public void setCodeCategorie(String codeCategorie)
  {
    this.codeCategorie = codeCategorie;
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
  
  public SousChapitre getSousChapitre()
  {
    return this.sousChapitre;
  }
  
  public void setSousChapitre(SousChapitre sousChapitre)
  {
    this.sousChapitre = sousChapitre;
  }
  
  public List<CimSousCategorie> getCimSousCategorieList()
  {
    return this.cimSousCategorieList;
  }
  
  public void setCimSousCategorieList(List<CimSousCategorie> cimSousCategorieList)
  {
    this.cimSousCategorieList = cimSousCategorieList;
  }
}
