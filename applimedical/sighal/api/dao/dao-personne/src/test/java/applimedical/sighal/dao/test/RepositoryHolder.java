package applimedical.sighal.dao.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import applimedical.sighal.api.pojo.Salle;
import applimedical.sighal.dao.SalleRepository;

public class RepositoryHolder {

   private SalleRepository salleRepository;
   
   public void setSalleRepository(SalleRepository salleRepository) {
      this.salleRepository = salleRepository;
   }
   public Salle chargerSalle(Long id) {
      return salleRepository.findOne(id);
   }
   public Salle creerSalle(Salle salle) {
      System.out.println("  |  salleRepository : " + (salleRepository == null));      
      return salleRepository.save(salle);
   }
}
