package com.application.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @class UtilisateurEntity
 * @author EL MOUDEN ABDELJALIL
 * @see elmoudene123@gmail.com
 * @creation 23/08/2020
 * @version 1.0.0
 *
 */

@Entity
@Table(name = "role")
public class RoleEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role", nullable = false)
	private Long idRole;
	
	@Column(name = "nom", nullable = false)
	private String nom;
	
	@Column(name = "description", nullable = false)
	private String description;

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
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

	public RoleEntity(Long idRole, String nom, String description) {
		super();
		this.idRole = idRole;
		this.nom = nom;
		this.description = description;
	}

	public RoleEntity() {
		super();
	}

	@Override
	public String toString() {
		return "RoleEntity [idRole=" + idRole + ", nom=" + nom + ", description=" + description + "]";
	}
	
	

}
