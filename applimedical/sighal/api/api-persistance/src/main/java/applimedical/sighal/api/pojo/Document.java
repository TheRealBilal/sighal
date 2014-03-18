package applimedical.sighal.api.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "document")
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "document_id")
	private Long docId;

	@Column(name = "type_doc")
	private String typeDoc ;

	@Column (name = "nom_doc")
	private String nomDoc;

	@Column( name = "chemin_doc")
	private String cheminDoc;

   @ManyToOne()
   @JoinColumn(name = "fiche_patient_id", referencedColumnName = "fiche_patient_id")
   private FichePatient fichePatient;

	public Long getDocId() {
		return docId;
	}

	public void setDocId(Long docId) {
		this.docId = docId;
	}

	public String getTypeDoc() {
		return typeDoc;
	}

	public void setTypeDoc(String typeDoc) {
		this.typeDoc = typeDoc;
	}

	public String getNomDoc() {
		return nomDoc;
	}

	public void setNomDoc(String nomDoc) {
		this.nomDoc = nomDoc;
	}

	public String getCheminDoc() {
		return cheminDoc;
	}

	public void setCheminDoc(String cheminDoc) {
		this.cheminDoc = cheminDoc;
	}

   public FichePatient getFichePatient() {
      return fichePatient;
   }

   public void setFichePatient(FichePatient fichePatient) {
      this.fichePatient = fichePatient;
   }
}