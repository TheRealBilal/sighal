package applimedical.sighal.dao.test;

import org.junit.Before;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import applimedical.sighal.api.pojo.Salle;

public class JPATest {
   private RepositoryHolder repositoryHolder;

   @Before
   public void setUp() {
      ApplicationContext context = new ClassPathXmlApplicationContext("dao-personne-cxt.xml");
      repositoryHolder = context.getBean("repositoryHolder", RepositoryHolder.class);
   }

   @Test
   public void test() {     
      Salle salle = new Salle();
      salle.setNomSalle("Adim room");
      System.out.println("id Salle : " +
            repositoryHolder.chargerSalle(
                  1L).getNomSalle());
   }

}
