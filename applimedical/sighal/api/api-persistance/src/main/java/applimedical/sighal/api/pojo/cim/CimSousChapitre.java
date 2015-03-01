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
@Table(name="sous_chapitre")
public class CimSousChapitre
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="sous_chapitre_id")
  private Long souChapitreID;
  @Column(name="libl")
  private String liblChapitre;
  @Column(name="code_deb")
  private String codeDebut;
  @Column(name="code_fin")
  private String codeFin;
  @Column(name="description")
  private String desc;
  @ManyToOne
  @JoinColumn(name="chapitre_id", referencedColumnName="chapitre_id")
  private CimChapitre chapitre;
  @OneToMany(cascade={javax.persistence.CascadeType.ALL}, mappedBy="sousChapitre", fetch=FetchType.LAZY)
  private List<CimCategorie> cimCategorieList;
  
  public Long getSouChapitreID()
  {
    return this.souChapitreID;
  }
  
  public void setSouChapitreID(Long souChapitreID)
  {
    this.souChapitreID = souChapitreID;
  }
  
  public String getLiblChapitre()
  {
    return this.liblChapitre;
  }
  
  public void setLiblChapitre(String liblChapitre)
  {
    this.liblChapitre = liblChapitre;
  }
  
  public String getCodeDebut()
  {
    return this.codeDebut;
  }
  
  public void setCodeDebut(String codeDebut)
  {
    this.codeDebut = codeDebut;
  }
  
  public String getCodeFin()
  {
    return this.codeFin;
  }
  
  public void setCodeFin(String codeFin)
  {
    this.codeFin = codeFin;
  }
  
  public String getDesc()
  {
    return this.desc;
  }
  
  public void setDesc(String desc)
  {
    this.desc = desc;
  }
  
  public CimChapitre getChapitre()
  {
    return this.chapitre;
  }
  
  public void setChapitre(CimChapitre chapitre)
  {
    this.chapitre = chapitre;
  }
  
  public List<CimCategorie> getCimCategorieList()
  {
    return this.cimCategorieList;
  }
  
  public void setCimCategorieList(List<CimCategorie> cimCategorieList)
  {
    this.cimCategorieList = cimCategorieList;
  }
}
