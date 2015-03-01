package applimedical.sighal.api.pojo.cim;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cim_chapitre")
public class CimChapitre
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="chapitre_id")
  private Long chapitreID;
  @Column(name="num_chapitre")
  private String numChapitre;
  @Column(name="libl")
  private String liblChapitre;
  @Column(name="code_deb")
  private String codeDebut;
  @Column(name="code_fin")
  private String codeFin;
  @Column(name="description")
  private String desc;
  @OneToMany(cascade={javax.persistence.CascadeType.ALL}, mappedBy="chapitre", fetch=FetchType.LAZY)
  private List<CimSousChapitre> sousChapitreList;
  
  public Long getChapitreID()
  {
    return this.chapitreID;
  }
  
  public void setChapitreID(Long chapitreID)
  {
    this.chapitreID = chapitreID;
  }
  
  public String getNumChapitre()
  {
    return this.numChapitre;
  }
  
  public void setNumChapitre(String numChapitre)
  {
    this.numChapitre = numChapitre;
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
  
  public List<CimSousChapitre> getSousChapitreList()
  {
    return this.sousChapitreList;
  }
  
  public void setSousChapitreList(List<CimSousChapitre> sousChapitreList)
  {
    this.sousChapitreList = sousChapitreList;
  }
}
