package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Intervention;

public interface InterventionRepository 
   extends CrudRepository<Intervention, Long>, JpaRepository<Intervention, Long> {
}