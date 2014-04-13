package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.BonEntree;

public interface BonEntreeRepository 
   extends CrudRepository<BonEntree, Long>, JpaRepository<BonEntree, Long> {
}