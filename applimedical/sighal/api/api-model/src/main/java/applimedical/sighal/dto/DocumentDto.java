package applimedical.sighal.dto;


public class DocumentDto {

	private Long docId;

	private String typeDoc ;

	private String nomDoc;

	private String cheminDoc;

   private FichePatientDto fichePatientDto;

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

   public FichePatientDto getFichePatientDto() {
      return fichePatientDto;
   }

   public void setFichePatientDto(FichePatientDto fichePatientDto) {
      this.fichePatientDto = fichePatientDto;
   }
}