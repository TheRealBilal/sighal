package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.TypeIntervention;

public interface TypeInterventionRepository 
   extends CrudRepository<TypeIntervention, Long>, JpaRepository<TypeIntervention, Long> {
}