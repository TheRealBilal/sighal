package applimedical.sighal.web.ressources;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import applimedical.sighal.business.RessourceBusiness;
import applimedical.sighal.dto.SalleDto;

@Controller("salleBn")
@ManagedBean
@ViewScoped
public class SalleMgBean {
   @Autowired
   private RessourceBusiness ressourceBusiness;

   private SalleDto selectedSalle;

   private List<SalleDto> salleList;

   @PostConstruct
   public void init() {
      selectedSalle = new SalleDto();
      salleList = ressourceBusiness.getToutesLesSalles();
   }

   public String startPage() {
      selectedSalle = new SalleDto();
      salleList = ressourceBusiness.getToutesLesSalles();
      return "listeSalle";
   }

   public String rechercher() {
      salleList = ressourceBusiness.getSalles(
            selectedSalle.getCodeSalle(), selectedSalle.getNomSalle());
      return "listeSalle";
   }

   public String initCreer() {
      selectedSalle = new SalleDto();
      return "editionSalle";
   }

   public String initModifier(SalleDto salle) {
      selectedSalle = salle;
      return "editionSalle";
   }

   public String sauvegarder() {
      ressourceBusiness.sauvegarderSalle(selectedSalle);
      return startPage();
   }

   public String supprimer(String salleId) {
      ressourceBusiness.supprimerSalle(Long.valueOf(salleId));
      return startPage();
   }

   public SalleDto getSelectedSalle() {
      return selectedSalle;
   }

   public void setSelectedSalle(SalleDto selectedSalle) {
      this.selectedSalle = selectedSalle;
   }

   public List<SalleDto> getSalleList() {
      return salleList;
   }

   public void setSalleList(List<SalleDto> salleList) {
      this.salleList = salleList;
   }
}
