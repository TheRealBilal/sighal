package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.Produit;

public interface ProduitRepository 
   extends CrudRepository<Produit, Long>, JpaRepository<Produit, Long> {
}