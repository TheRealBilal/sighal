package applimedical.sighal.dto;

import java.util.List;

public class SousCategorieDto {

	private Long sousCategorieId;

	private String nom;

	private String description;

	private CategorieDto categorieDto;

	private List<ProduitDto> produitsDtoList;

	public Long getSousCategorieId() {
		return sousCategorieId;
	}

	public void setSousCategorieId(Long sousCategorieId) {
		this.sousCategorieId = sousCategorieId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CategorieDto getCategorieDto() {
		return categorieDto;
	}

	public void setCategorieDto(CategorieDto categorieDto) {
		this.categorieDto = categorieDto;
	}

	public List<ProduitDto> getProduitsDtoList() {
		return produitsDtoList;
	}

	public void setProduitsDtoList(List<ProduitDto> produitsDtoList) {
		this.produitsDtoList = produitsDtoList;
	}


}