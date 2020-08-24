package com.application.api.entity;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "utilisateur")
public class UtilisateurEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utilisateur", nullable = false)
	private Long idUtilisateur;
	
	@Column(name = "nom", nullable = false)
	private String nom;
	
	@Column(name = "prenom", nullable = false)
	private String prenom;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "is_active", nullable = false)
	private boolean isActive;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<RoleEntity> roles = new ArrayList<>();

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public java.util.Collection<RoleEntity> getRoles() {
		return roles;
	}

	public void setRoles(java.util.Collection<RoleEntity> roles) {
		this.roles = roles;
	}

	public UtilisateurEntity(Long idUtilisateur, String nom, String prenom, String username, String password,
			boolean isActive, Collection<RoleEntity> roles) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
		this.isActive = isActive;
		this.roles = roles;
	}

	public UtilisateurEntity() {
		super();
	}

	@Override
	public String toString() {
		return "UtilisateurEntity [idUtilisateur=" + idUtilisateur + ", nom=" + nom + ", prenom=" + prenom
				+ ", username=" + username + ", password=" + password + ", isActive=" + isActive + ", roles=" + roles
				+ "]";
	}
	
	

}
