--connexion root--/
mysql -h localhost -u root;

/--Creation d'un utilisateur--/
GRANT ALL PRIVILEGES ON sighal_database.sighal_database TO 'sighalWebUser'@'localhost' IDENTIFIED BY '123456' WITH GRANT OPTION;

/--Creation d'une base de donnée--/
CREATE DATABASE sighal_database;

exit;