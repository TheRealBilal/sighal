package applimedical.sighal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import applimedical.sighal.api.pojo.Salle;

public interface SalleRepository
   extends CrudRepository<Salle, Long>, JpaRepository<Salle, Long> {
   List<Salle> findByNomSalleLike(String nomSalle);

}