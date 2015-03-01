package applimedical.sighal.api.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="personnel")
public class Personnel extends Personne {
	@Column()
	private String matricule;

	@Column(name ="login", unique=true)
	private String login;

	@Column(name ="mot_de_passe")
	private String motDePasse;

	@Column(name = "date_embauche")
	private Date dateEmbauche;

	@Column()
	private Integer experience;

	@Column()
	private Double salaire;

	@OneToMany(mappedBy = "personnel")
	private List<PersonnelService> personnelServiceList;

	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="personnel_qualification",
			joinColumns={@JoinColumn(name="personne_id", referencedColumnName="id")},
			inverseJoinColumns={@JoinColumn(name="qualification_id", referencedColumnName="id")}
			)
	private List<Qualification> qualificationList;

	@OneToMany(mappedBy="personnel")
	private List<RendezVous> rendezVousArrangeList;

	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="personnel_rendez_vous",
			joinColumns={@JoinColumn(name="personne_id", referencedColumnName="id")},
			inverseJoinColumns={@JoinColumn(name="rendez_vous_id", referencedColumnName="id")}
			)
	private List<RendezVous> rendezVousPourList;

	@ManyToOne
	@JoinColumn(name ="fonction_id" , referencedColumnName ="id")
	private Fonction fonction;

	public List<PersonnelService> getPersonnelServiceList() {
		return personnelServiceList;
	}

	public void setPersonnelServiceList(List<PersonnelService> personnelServiceList) {
		this.personnelServiceList = personnelServiceList;
	}

	public List<Qualification> getQualificationList() {
		return qualificationList;
	}

	public void setQualificationList(List<Qualification> qualificationList) {
		this.qualificationList = qualificationList;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	public List<RendezVous> getRendezVousArrangeList() {
		return rendezVousArrangeList;
	}

	public void setRendezVousArrangeList(List<RendezVous> rendezVousArrangeList) {
		this.rendezVousArrangeList = rendezVousArrangeList;
	}

	public List<RendezVous> getRendezVousPourList() {
		return rendezVousPourList;
	}

	public void setRendezVousPourList(List<RendezVous> rendezVousPourList) {
		this.rendezVousPourList = rendezVousPourList;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}
}