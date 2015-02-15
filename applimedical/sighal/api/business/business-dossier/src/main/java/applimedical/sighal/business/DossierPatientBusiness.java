
package applimedical.sighal.business;

import java.util.List;

import applimedical.sighal.api.pojo.DossierPatient;
import applimedical.sighal.api.pojo.FichePatient;
import applimedical.sighal.api.pojo.Patient;
import applimedical.sighal.criteres.CriteresDossierPatient;

public interface DossierPatientBusiness {

	public Long createDossierPatient(Patient patientdto);
	public List<FichePatient> getListeFichePatient(Long dossierPatientId);

	public DossierPatient getDossierPatient(Long id);

	public List<Patient> recherchePatientDossier(CriteresDossierPatient criteres);
}
