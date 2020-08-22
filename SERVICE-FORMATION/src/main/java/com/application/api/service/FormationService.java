package com.application.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.api.entity.FormationEntity;

/**
 * @service "FormationService"
 * @author ABDELJALIL EL MOUDEN
 * @creation 20/08/2020
 * @version 1.0.0
 * @see elmoudene123@gmail.com
 * 
 * */

public interface FormationService {
	
	/**
	 * get all formation
	 * @param
	 * @return
	 */
	public List<FormationEntity> getAllFormations();
	
	/**
	 * get formation by id
	 * @param 
	 * @return 
	 */
	public FormationEntity getFormationById(Long idFormation);
	
	/**
	 * delete formation
	 * @param idFormation
	 * @return 
	 */
	public void deteleFormation(FormationEntity entity);
	
	/**
	 * add formation
	 * @param formation
	 * @return FormationEntity
	 */
	public FormationEntity addFormation(FormationEntity formation);
	
	/**
	 * update formation
	 * @param formation
	 * @return FormationEntity
	 */
	public FormationEntity updateFormation(FormationEntity formation);

}
