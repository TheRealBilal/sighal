package applimedical.sighal.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.repository.query.Param;

import applimedical.sighal.api.pojo.Patient;
import applimedical.sighal.dao.PatientSpecifiqRepository;

public class PatientRepositoryImpl implements
		PatientSpecifiqRepository {

	@PersistenceContext
	private EntityManager em;
	
	public PatientRepositoryImpl() {

	}

	
//	  @Query("SELECT p FROM Patient p"
//		         + " WHERE p.nom LIKE :nom AND p.prenom LIKE :prenom"
//			   + " OR FORMAT(p.dossierPatient.dossierPatientId) =: FORMAT(doss,0) OR p.matricule = :matri ")
		   public List<Patient> findListePatient(
				   @Param("nom") String nom,
				   @Param("prenom")String prenom,
				   @Param("dossierPatient")Long numDoss,
				   @Param("matricule")String matricule){
		
			   
			   String sqlReq = "SELECT p FROM Patient p "
					   + "WHERE p.nom LIKE '"+nom +"' AND p.prenom LIKE '"+prenom+"'";
			   if(null!=numDoss){
				   sqlReq+=" AND p.dossierPatient.dossierPatientId ="+numDoss+" ";
			   }
			   if(null!=matricule && !matricule.isEmpty()){
				   sqlReq+=" AND p.matricule ='"+matricule+"' ";
			   }
					   
			  Query query = em.createQuery(sqlReq);
			  List<Patient> result = query.getResultList();
			   
//		CriteriaQuery<Patient> criteria = builder.createQuery(Patient.class);
//		Root<Patient> patientRoot = criteria.from( Patient.class );	 
//		criteria.select(patientRoot)
//	      .where(builder.equal(patientRoot.get("nom"),nom)).
		return result;
		  
	  }
}
