
package applimedical.sighal.business;

import java.util.List;
import applimedical.sighal.dto.DossierPatientDto;
import applimedical.sighal.dto.FichePatientDto;
import applimedical.sighal.criteres.CriteresDossierPatient;
import applimedical.sighal.dto.PatientDto;

public interface DossierPatientBusiness {

	public Long createDossierPatient(PatientDto patientdto);
	public List<FichePatientDto> getListeFichePatient(Long dossierPatientId);

	public DossierPatientDto getDossierPatient(Long id);

	public List<PatientDto> recherchePatientDossier(CriteresDossierPatient criteres);
}
