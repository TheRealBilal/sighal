package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Fournisseur;

public interface FournisseurRepository 
   extends CrudRepository<Fournisseur, Long>, JpaRepository<Fournisseur, Long> {
}