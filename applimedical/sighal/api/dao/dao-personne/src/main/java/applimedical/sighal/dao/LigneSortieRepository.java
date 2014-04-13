package applimedical.sighal.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import applimedical.sighal.api.pojo.LigneSortie;

public interface LigneSortieRepository 
   extends CrudRepository<LigneSortie, Long>, JpaRepository<LigneSortie, Long> {
}