package applimedical.sighal.dao.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import applimedical.sighal.api.pojo.Personnel;

public class JPATest {

   @Test
   public void test() {
      EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory( "entityManager" );

      EntityManager entityManager = entityManagerFactory.createEntityManager();
      entityManager.getTransaction().begin();
//    entityManager.persist( new Event( "Our very first event!", new Date() ) );
//    entityManager.persist( new Event( "A follow up event", new Date() ) );
      Personnel test = new Personnel();
      test.setNom("The best personnel");
      entityManager.persist(test);
      System.out.println("id personnel : " + test.getPersonneId());
      entityManager.getTransaction().commit();
      entityManager.close();
   }

}
