package applimedical.sighal.business;

import applimedical.sighal.dto.PersonnelDto;

public interface PersonneBusiness {
	boolean authentifier (String login, String mdp);
   PersonnelDto chargerPersonnel(String login);
}
