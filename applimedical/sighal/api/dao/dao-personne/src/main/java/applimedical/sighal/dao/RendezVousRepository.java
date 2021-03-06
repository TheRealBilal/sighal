package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.RendezVous;

public interface RendezVousRepository 
   extends CrudRepository<RendezVous, Long>, JpaRepository<RendezVous, Long> {
}