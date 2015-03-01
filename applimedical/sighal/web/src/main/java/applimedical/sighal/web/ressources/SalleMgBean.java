package applimedical.sighal.web.ressources;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import applimedical.sighal.api.pojo.Salle;
import applimedical.sighal.business.RessourceBusiness;

@Controller("salleBn")
@ManagedBean
@ViewScoped
public class SalleMgBean {
   @Autowired
   private RessourceBusiness ressourceBusiness;

   private Salle selectedPojo;
   private List<Salle> salles;

   @PostConstruct
   public void init() {
      selectedPojo = new Salle();
      salles = ressourceBusiness.findAll();
   }

   public String startPage() {
      selectedPojo = new Salle();
      salles = ressourceBusiness.findAll();
      return "listeSalle";
   }

   public String rechercher() {
      salles = ressourceBusiness.findSalles(
            selectedPojo.getCodeSalle(), selectedPojo.getNomSalle());
      return "listeSalle";
   }

   public String initCreer() {
      selectedPojo = new Salle();
      return "editionSalle";
   }

   public String initModifier(Salle salle) {
      selectedPojo = salle;
      return "editionSalle";
   }

   public String sauvegarder() {
      ressourceBusiness.saveOrUpdate(selectedPojo);
      return startPage();
   }

   public String supprimer(String salleId) {
      ressourceBusiness.delete(Long.valueOf(salleId));
      return startPage();
   }

   public Salle getSelectedPojo() {
      return selectedPojo;
   }

   public void setSelectedPojo(Salle selectedPojo) {
      this.selectedPojo = selectedPojo;
   }

   public List<Salle> getSalles() {
      return salles;
   }
}
