package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.LigneCommande;

public interface LigneCommandeRepository 
   extends CrudRepository<LigneCommande, Long>, JpaRepository<LigneCommande, Long> {
}