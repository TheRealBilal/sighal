CREATE VIEW view_personnel_roles AS SELECT p.login, f.nom_fonction
FROM personnel p JOIN fonction f ON (f.fonction_id= p.fonction_id);