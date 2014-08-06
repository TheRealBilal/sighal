INSERT INTO fonction (fonction_id, nom_fonction, description)
VALUES (1, 'Medecin', 'Osculte des gens, donne des ordonnances, se tape de l''argent...');

INSERT INTO fonction (fonction_id, nom_fonction, description)
VALUES (2, 'Secrétaire', 'Prend des Rendez vous pour les gens, fais patienter les gens, se tape de l''argent...');

INSERT INTO fonction (fonction_id, nom_fonction, description)
VALUES (3, 'Aide Soignant', 'Prend en charge les cas faciles sans médecin, se tape de l''argent...');

INSERT INTO Personnel (personne_id, login, mot_de_passe, nom, prenom, fonction_id)
VALUES (1, 'adbi', '123456', 'Adim', 'Bilal', 1);

INSERT INTO Personnel (personne_id, login, mot_de_passe, nom, prenom, fonction_id)
VALUES (2, 'lami', '123456', 'Lalaoui', 'Amine', 2);

INSERT INTO Personnel (personne_id, login, mot_de_passe, nom, prenom, fonction_id)
VALUES (3, 'hama', '123456', 'Hazem', 'Marouane', 3);