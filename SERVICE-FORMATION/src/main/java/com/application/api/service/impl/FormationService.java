package com.application.api.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.api.controller.FormationController;
import com.application.api.entity.FormationEntity;
import com.application.api.repository.FormationRepository;
import com.application.api.service.IFormationService;

/**
 * @interface IFormationService
 * @author ABDELJALIL EL MOUDEN
 * @creation 20/08/2020
 * @version 1.0.0
 * @see elmoudene123@gmail.com
 * 
 * */

@Service
public class FormationService implements IFormationService{

	private static final Logger logger = LogManager.getLogger(FormationController.class);
	
	@Autowired
	private FormationRepository formationRepository;
	
	/**
	 * @return  All Formation
	 * @param
	 * 
	 */
	@Override
	public List<FormationEntity> getAllFormations() {
		
		List<FormationEntity> formations = null;
		try {
			return formationRepository.findAll();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		if(logger.isInfoEnabled()) {
			logger.info("=== gat all formation ===");
		}
		return formations;
	}

	/**
	 * @return  get One Formation
	 * @param idFormation
	 * 
	 */
	@Override
	public FormationEntity getFormationById(Long idFormation){
		
		if(logger.isInfoEnabled()) {
			logger.info("=== gat formation by id ===");
		}
		return formationRepository.findById(idFormation).get();
	}
	/**
	 * @return  Delete Formation
	 * @param idFormation
	 * 
	 */
	@Override
	public void deteleFormation(FormationEntity formation) {
		
		try {
			 formationRepository.delete(formation);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		if(logger.isInfoEnabled()) {
			logger.info("=== delete formation ===");
		}
	}

	/**
	 * @return  Add Formation
	 * @param formation
	 * 
	 */
	@Override
	public FormationEntity addFormation(FormationEntity formationEntity) {
		 
		FormationEntity entity = new FormationEntity();
		try {
			entity = formationRepository.save(formationEntity);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		if(logger.isInfoEnabled()) {
			logger.info("=== add formation ===");
		}
		return entity;
	}

	/**
	 * @return  Update Formation
	 * @param formation
	 * 
	 */
	@Override
	public FormationEntity updateFormation(FormationEntity formationEntity) {
		FormationEntity entity = new FormationEntity();
		try {
			entity = formationRepository.save(formationEntity);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		if(logger.isInfoEnabled()) {
			logger.info("=== update formation ===");
		}
		return entity;
	}



 

 

}
