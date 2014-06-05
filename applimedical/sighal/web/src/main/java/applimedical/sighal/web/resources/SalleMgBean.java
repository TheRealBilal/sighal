package applimedical.sighal.web.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import applimedical.sighal.business.PersonneBusiness;
import applimedical.sighal.dto.SalleDto;

@Component("salleBn")
@Scope("request")
public class SalleMgBean {
   @Autowired
   private PersonneBusiness personneBusiness;

   private SalleDto selectedSalle;

   private List<SalleDto> salleList;

   public String startPage() {
      selectedSalle = new SalleDto();
      salleList = new ArrayList<SalleDto>();
      SalleDto salle = new SalleDto();
      salle.setCodeSalle("codeSalle1");
      salle.setNomSalle("nomSalle1");
      salle.setDecriptionSalle("codeSalle1");
      salle.setCommentarySalle("CommentarySalle1");
      salleList.add(salle);
      salle = new SalleDto();
      salle.setCodeSalle("codeSalle2");
      salle.setNomSalle("nomSalle2");
      salle.setDecriptionSalle("codeSalle2");
      salle.setCommentarySalle("CommentarySalle2");
      salleList.add(salle);
      salle = new SalleDto();
      salle.setCodeSalle("codeSalle3");
      salle.setNomSalle("nomSalle3");
      salle.setDecriptionSalle("codeSalle3");
      salle.setCommentarySalle("CommentarySalle3");
      salleList.add(salle);
      return "pages/resources/salles.xhtml";
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
