package applimedical.sighal.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import applimedical.sighal.api.pojo.Salle;

public interface SalleRepository
   extends CrudRepository<Salle, Long>, JpaRepository<Salle, Long> {
   List<Salle> findByNomSalleLike(String nomSalle);

   @Query("SELECT s FROM Salle s"
         + " WHERE s.codeSalle LIKE :code AND s.nomSalle LIKE :nom")
   List<Salle> findListeSalle(
         @Param("code") String code,
         @Param("nom") String nom);
}