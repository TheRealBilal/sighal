package applimedical.sighal.api.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import applimedical.sighal.api.pojo.tmp.Salle;

public class JPATest {

   @Test
   public void test() {
      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "entityManager" );
      
      EntityManager entityManager = entityManagerFactory.createEntityManager();
      entityManager.getTransaction().begin();
//    entityManager.persist( new Event( "Our very first event!", new Date() ) );
//    entityManager.persist( new Event( "A follow up event", new Date() ) );
      Salle test = new Salle();
      test.setNomSalle("The best salle");
      entityManager.persist(test);
      System.out.println("id salle : " + test.getNumSalle());
      entityManager.getTransaction().commit();
      entityManager.close();
   }

}
