
package com.application.api.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.application.api.entity.FormationEntity;

public class FormationDto {

	private Long idFormation;

	private String titre;

	private String description;

	private Date dateDebut;

	private Date dateFin;

	private String prix;

	private boolean gratuit;

	public Long getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(Long idFormation) {
		this.idFormation = idFormation;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public boolean isGratuit() {
		return gratuit;
	}

	public void setGratuit(boolean gratuit) {
		this.gratuit = gratuit;
	}

	public FormationDto(Long idFormation, String titre, String description, Date dateDebut, Date dateFin, String prix,
			boolean gratuit) {
		super();
		this.idFormation = idFormation;
		this.titre = titre;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prix = prix;
		this.gratuit = gratuit;
	}

	public FormationDto() {
		super();
	}

	public static FormationDto entityToDto(FormationEntity entity) {
		FormationDto formationDto = null;
		if (entity != null) {
			formationDto = new FormationDto();
			formationDto.setIdFormation(entity.getIdFormation());
			formationDto.setTitre(entity.getTitre());
			formationDto.setDescription(entity.getDescription());
			formationDto.setDateDebut(entity.getDateDebut());
			formationDto.setDateFin(entity.getDateFin());
			formationDto.setPrix(entity.getPrix());
			formationDto.setGratuit(false);
		}
		return formationDto;
	}

	public static List<FormationDto> entitiesToDtos(List<FormationEntity> listEntity) {

		List<FormationDto> listFormationDto = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listEntity)) {
			for (FormationEntity entity : listEntity) {
				listFormationDto.add(entityToDto(entity));
			}
		}
		return listFormationDto;
	}

	public static FormationEntity dtoToEntity(FormationDto dto) {
		FormationEntity formationEntity = new FormationEntity();
		if (dto != null) {
			formationEntity.setIdFormation(dto.getIdFormation());
			formationEntity.setTitre(dto.getTitre());
			formationEntity.setDescription(dto.getDescription());
			formationEntity.setDateDebut(dto.getDateDebut());
			formationEntity.setDateFin(dto.getDateFin());
			formationEntity.setPrix(dto.getPrix());
			formationEntity.setGratuit(false);
		}
		return formationEntity;
	}

	public static FormationEntity dtosToEntities(List<FormationDto> listDto) {
		List<FormationEntity> listFormationEntity = new ArrayList<>();
		if (!CollectionUtils.isEmpty(listDto)) {
			for (FormationDto dto : listDto) {
				listFormationEntity.add(dtoToEntity(dto));
			}
		}
		return (FormationEntity) listFormationEntity;
	}

}
