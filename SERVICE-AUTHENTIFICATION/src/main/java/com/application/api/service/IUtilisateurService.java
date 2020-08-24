package com.application.api.service;

import java.util.List;

import com.application.api.entity.UtilisateurEntity;

/**
 * @interface "IUtilisateurService"
 * @author ABDELJALIL EL MOUDEN
 * @creation 24/08/2020
 * @version 1.0.0
 * @see elmoudene123@gmail.com
 * 
 * */

public interface IUtilisateurService {
	
	/**
	 * get all utilisateur
	 * @param
	 * @return
	 */
	public List<UtilisateurEntity> getAllUtilisateurs();
	
	/**
	 * get utilisateur by username
	 * @param username
	 * @return 
	 */
	public UtilisateurEntity getUtilisateurByUsername(String username);
	
	/**
	 * get utilisateur by id
	 * @param idUtilisateur
	 * @return 
	 */
	public UtilisateurEntity getUtilisateurById(Long idUtilisateur);
	
	/**
	 * delete formation
	 * @param utilisateur
	 * @return 
	 */
	
	public void deteleUtilisateur(UtilisateurEntity utilisateur);
	
	/**
	 * add utilisateur
	 * @param utilisateur
	 * @return UtilisateurEntity
	 */
	public UtilisateurEntity addUtilisateur(UtilisateurEntity utilisateur);
	
	/**
	 * update utilisateur
	 * @param utilisateur
	 * @return UtilisateurEntity
	 */
	public UtilisateurEntity updateUtilisateur(UtilisateurEntity utilisateur);
	
	/**
	 * add role to utilisateur
	 * @param utilisateur
	 * @return UtilisateurEntity
	 */
	public void addRoleToUtilisateur(String username, String nomRole);

}
