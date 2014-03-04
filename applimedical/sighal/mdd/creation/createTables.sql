drop table if exists BonEntree;

drop table if exists Categorie;

drop table if exists Command;

drop table if exists DossierPatient;

drop table if exists FichePatient;

drop table if exists FichePatientDentaire;

drop table if exists FichePatientGenerale;

drop table if exists Fonction;

drop table if exists Fournisseur;

drop table if exists Intervenant;

drop table if exists Intervention;

drop table if exists LigneCommand;

drop table if exists Membre_organe_;

drop table if exists Module;

drop table if exists Patient;

drop table if exists Permission;

drop table if exists Personne;

drop table if exists Personnel;

drop table if exists PersonnelService;

drop table if exists Produit;

drop table if exists Qualification;

drop table if exists Rdv;

drop table if exists Salle;

drop table if exists Service;

drop table if exists Soin;

drop table if exists SousCategorie;

drop table if exists TypeDeSoin;

drop table if exists TypeIntervention;

drop table if exists document;


/*==============================================================*/
/* Table : BonEntree                                            */
/*==============================================================*/
create table BonEntree
(
   dateEntree           datetime,
   prixGlobal           int
);

/*==============================================================*/
/* Table : Categorie                                            */
/*==============================================================*/
create table Categorie
(
   codeCateg            int,
   nomCateg             varchar(254),
   descCateg            varchar(254)
);

/*==============================================================*/
/* Table : Command                                              */
/*==============================================================*/
create table Command
(
   dateComand           int,
   dateEntreeSouhaitee  int
);

/*==============================================================*/
/* Table : DossierPatient                                       */
/*==============================================================*/
create table DossierPatient
(
   numero               int,
   date_crea_doss       datetime,
   date_maj_doss        datetime
);

/*==============================================================*/
/* Table : FichePatient                                         */
/*==============================================================*/
create table FichePatient
(
   type                 varchar(254),
   date_crea_fich       datetime,
   date_maj_fich        datetime,
   observation          int
);

/*==============================================================*/
/* Table : FichePatientDentaire                                 */
/*==============================================================*/
create table FichePatientDentaire;

/*==============================================================*/
/* Table : FichePatientGenerale                                 */
/*==============================================================*/
create table FichePatientGenerale
(
   description          varchar(254),
   domaine              varchar(254)
);

/*==============================================================*/
/* Table : Fonction                                             */
/*==============================================================*/
create table Fonction
(
   codeFonction         int,
   nomFonction          varchar(254),
   description          varchar(254),
   active               bool
);

/*==============================================================*/
/* Table : Fournisseur                                          */
/*==============================================================*/
create table Fournisseur
(
   adresse              int,
   tel                  int,
   raisonSocial         int,
   "desc"               int,
   remarque             int
);

/*==============================================================*/
/* Table : Intervenant                                          */
/*==============================================================*/
create table Intervenant;

/*==============================================================*/
/* Table : Intervention                                         */
/*==============================================================*/
create table Intervention
(
   idInterv             int,
   dateInterv           datetime,
   dureeInterv          int,
   typeInterv           TypeIntervention,
   descInterv           varchar(254)
);

/*==============================================================*/
/* Table : LigneCommand                                         */
/*==============================================================*/
create table LigneCommand
(
   quantite             int,
   prix                 int
);

/*==============================================================*/
/* Table : Membre_organe_                                       */
/*==============================================================*/
create table Membre_organe_;

/*==============================================================*/
/* Table : Module                                               */
/*==============================================================*/
create table Module
(
   codeModule           int,
   nomModule            varchar(254),
   description          varchar(254),
   active               bool
);

/*==============================================================*/
/* Table : Patient                                              */
/*==============================================================*/
create table Patient
(
   matricule            int,
   poid                 int,
   taille               int,
   antecedents          bool,
   commentaire          varchar(254)
);

/*==============================================================*/
/* Table : Permission                                           */
/*==============================================================*/
create table Permission
(
   codePermission       int,
   description          varchar(254),
   typeDroit            int,
   dateDebut            datetime,
   dateFin              datetime
);

/*==============================================================*/
/* Table : Personne                                             */
/*==============================================================*/
create table Personne
(
   id                   int,
   nom                  varchar(254),
   prenom               varchar(254),
   dateNaiss            datetime,
   adresse              varchar(254),
   tel                  int,
   civilite             varchar(254)
);

/*==============================================================*/
/* Table : Personnel                                            */
/*==============================================================*/
create table Personnel
(
   matricule            int,
   dateEmb              datetime,
   experience           int,
   salaire              int
);

/*==============================================================*/
/* Table : PersonnelService                                     */
/*==============================================================*/
create table PersonnelService
(
   isServiceChef        bool
);

/*==============================================================*/
/* Table : Produit                                              */
/*==============================================================*/
create table Produit
(
   codeProd             int,
   nomProd              varchar(254),
   descProd             varchar(254),
   dateFabric           datetime,
   dateExpiration       datetime,
   nb_de_util           int,
   quantite             int,
   stockAlert           int,
   quantiteSortie       int,
   dateSortie           datetime
);

/*==============================================================*/
/* Table : Qualification                                        */
/*==============================================================*/
create table Qualification
(
   nom                  varchar(254),
   codeQualif           int,
   descQualif           int
);

/*==============================================================*/
/* Table : Rdv                                                  */
/*==============================================================*/
create table Rdv
(
   numRdv               int,
   datePriseRdv         datetime,
   dateRdv              int,
   etat                 __enumeration__EtatRdv
);

/*==============================================================*/
/* Table : Salle                                                */
/*==============================================================*/
create table Salle
(
   numSalle             bigint,
   nomSalle             varchar(254)
);

/*==============================================================*/
/* Table : Service                                              */
/*==============================================================*/
create table Service
(
   serviceId            int,
   nom                  varchar(254),
   description          varchar(254)
);

/*==============================================================*/
/* Table : Soin                                                 */
/*==============================================================*/
create table Soin
(
   identifient          varchar(254),
   typeSoin             varchar(254),
   descriptionSoin      int
);

/*==============================================================*/
/* Table : SousCategorie                                        */
/*==============================================================*/
create table SousCategorie
(
   codeSousCat          int,
   nomSousCat           varchar(254),
   descSousCat          varchar(254)
);

/*==============================================================*/
/* Table : TypeDeSoin                                           */
/*==============================================================*/
create table TypeDeSoin
(
   codeType             varchar(254),
   nomType              varchar(254),
   categorieType        int,
   descriptionType      int
);

/*==============================================================*/
/* Table : TypeIntervention                                     */
/*==============================================================*/
create table TypeIntervention
(
   codeTypeInterv       varchar(254),
   nomTypeInterv        varchar(254),
   descTypeInterv       varchar(254)
);



/*==============================================================*/
/* Table : document                                             */
/*==============================================================*/
create table document
(
   Type                 varchar(254),
   nomDoc               varchar(254),
   path                 varchar(254)
);

alter table Association_39 add constraint FK_Association_39 foreign key ()
      references Salle on delete restrict on update restrict;

alter table Association_39 add constraint FK_Association_39 foreign key ()
      references Service on delete restrict on update restrict;

alter table Association_40 add constraint FK_Association_40 foreign key ()
      references Fonction on delete restrict on update restrict;

alter table Association_40 add constraint FK_Association_40 foreign key ()
      references Service on delete restrict on update restrict;

alter table BonEntree add constraint FK_Association_30 foreign key ()
      references Command on delete restrict on update restrict;

alter table BonEntree add constraint FK_Association_5 foreign key ()
      references Command on delete restrict on update restrict;

alter table Categorie add constraint FK_Association_1 foreign key ()
      references SousCategorie on delete restrict on update restrict;

alter table Command add constraint FK_Association_6 foreign key ()
      references Fournisseur on delete restrict on update restrict;

alter table DossierPatient add constraint FK_Association_8 foreign key ()
      references Patient on delete restrict on update restrict;

alter table DossierPatient add constraint FK_Association_9 foreign key ()
      references FichePatient on delete restrict on update restrict;

alter table FichePatient add constraint FK_Association_23 foreign key ()
      references Personnel on delete restrict on update restrict;

alter table FichePatient add constraint FK_Association_32 foreign key ()
      references Intervention on delete restrict on update restrict;

alter table FichePatient add constraint FK_Association_37 foreign key ()
      references Soin on delete restrict on update restrict;

alter table FichePatientDentaire add constraint FK_Association_14 foreign key ()
      references Membre_organe_ on delete restrict on update restrict;

alter table FichePatientDentaire add constraint FK_Generalisation_4 foreign key ()
      references FichePatient on delete restrict on update restrict;

alter table FichePatientGenerale add constraint FK_Association_26 foreign key ()
      references __enumeration__Domaine on delete restrict on update restrict;

alter table FichePatientGenerale add constraint FK_Association_36 foreign key ()
      references Soin on delete restrict on update restrict;

alter table FichePatientGenerale add constraint FK_Generalisation_5 foreign key ()
      references FichePatient on delete restrict on update restrict;

alter table Fonction add constraint FK_Association_12 foreign key ()
      references Permission on delete restrict on update restrict;

alter table Fonction add constraint FK_Association_15 foreign key ()
      references Personnel on delete restrict on update restrict;

alter table Intervenant add constraint FK_Association_25 foreign key ()
      references Rdv on delete restrict on update restrict;

alter table Intervenant add constraint FK_Generalisation_3 foreign key ()
      references Personnel on delete restrict on update restrict;

alter table Intervention add constraint FK_Association_16 foreign key ()
      references Intervenant on delete restrict on update restrict;

alter table Intervention add constraint FK_Association_20 foreign key ()
      references Rdv on delete restrict on update restrict;

alter table Intervention add constraint FK_Association_32 foreign key ()
      references FichePatient on delete restrict on update restrict;

alter table LigneCommand add constraint FK_Association_4 foreign key ()
      references Command on delete restrict on update restrict;

alter table LigneCommand add constraint FK_Association_4 foreign key ()
      references Produit on delete restrict on update restrict;

alter table Membre_organe_ add constraint FK_Association_14 foreign key ()
      references FichePatientDentaire on delete restrict on update restrict;

alter table Membre_organe_ add constraint FK_Association_34 foreign key ()
      references Soin on delete restrict on update restrict;

alter table Module add constraint FK_Association_11 foreign key ()
      references Permission on delete restrict on update restrict;

alter table Patient add constraint FK_Association_24 foreign key ()
      references Rdv on delete restrict on update restrict;

alter table Patient add constraint FK_Generalisation_2 foreign key ()
      references Personne on delete restrict on update restrict;

alter table Permission add constraint FK_Association_10 foreign key ()
      references __enumeration___Droit on delete restrict on update restrict;

alter table Personnel add constraint FK_Association_27 foreign key ()
      references DossierPatient on delete restrict on update restrict;

alter table Personnel add constraint FK_Association_29 foreign key ()
      references Patient on delete restrict on update restrict;

alter table Personnel add constraint FK_Generalisation_1 foreign key ()
      references Personne on delete restrict on update restrict;

alter table PersonnelService add constraint FK_Association_38 foreign key ()
      references Personnel on delete restrict on update restrict;

alter table PersonnelService add constraint FK_Association_38 foreign key ()
      references Service on delete restrict on update restrict;

alter table Produit add constraint FK_Association_3 foreign key ()
      references Personnel on delete restrict on update restrict;

alter table Qualification add constraint FK_Association_7 foreign key ()
      references Personnel on delete restrict on update restrict;

alter table Rdv add constraint FK_Association_17 foreign key ()
      references Personnel on delete restrict on update restrict;

alter table Salle add constraint FK_Association_21 foreign key ()
      references Rdv on delete restrict on update restrict;

alter table Salle add constraint FK_Association_22 foreign key ()
      references Intervention on delete restrict on update restrict;

alter table Soin add constraint FK_Association_31 foreign key ()
      references TypeDeSoin on delete restrict on update restrict;

alter table Soin add constraint FK_Association_33 foreign key ()
      references FichePatientDentaire on delete restrict on update restrict;

alter table SousCategorie add constraint FK_Association_2 foreign key ()
      references Produit on delete restrict on update restrict;

alter table TypeDeSoin add constraint FK_Association_35 foreign key ()
      references Soin on delete restrict on update restrict;

alter table TypeIntervention add constraint FK_Association_19 foreign key ()
      references Intervention on delete restrict on update restrict;

alter table __enumeration__EtatRdv add constraint FK_Association_18 foreign key ()
      references Rdv on delete restrict on update restrict;

alter table document add constraint FK_Association_28 foreign key ()
      references FichePatient on delete restrict on update restrict;


