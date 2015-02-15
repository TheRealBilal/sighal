package applimedical.sighal.business;

import applimedical.sighal.api.pojo.Personnel;

public interface PersonneBusiness {
	boolean authentifier (String login, String mdp);
   Personnel chargerPersonnel(String login);
}
