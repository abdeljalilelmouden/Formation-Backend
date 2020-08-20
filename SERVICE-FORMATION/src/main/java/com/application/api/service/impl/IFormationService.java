package com.application.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.api.entity.FormationEntity;
import com.application.api.repository.FormationRepository;
import com.application.api.service.FormationService;

/**
 * @interface IFormationService
 * @author ABDELJALIL EL MOUDEN
 * @creation 20/08/2020
 * @version 1.0.0
 * @see elmoudene123@gmail.com
 * 
 * */

@Service
public class IFormationService implements FormationService{

	
	@Autowired
	private FormationRepository formationRepository;
	
	
	/**
	 * @return  All Formation
	 * @param
	 * 
	 */
	@Override
	public List<FormationEntity> getAllFormations() {
		return formationRepository.findAll();
	}

	/**
	 * @return  get One Formation
	 * @param idFormation
	 * 
	 */
	@Override
	public FormationEntity getOneFormation(Long idFormation) {
		return formationRepository.findById(idFormation).orElse(null);
	}

	/**
	 * @return  Delete Formation
	 * @param idFormation
	 * 
	 */
	@Override
	public void deteleFormation(long idFormation) {
		formationRepository.deleteById(idFormation);
	}

	/**
	 * @return  Add Formation
	 * @param formation
	 * 
	 */
	@Override
	public void addFormation(FormationEntity formation) {
		formationRepository.save(formation);
	}

	/**
	 * @return  Update Formation
	 * @param formation
	 * 
	 */
	@Override
	public void updateFormation(FormationEntity formation) {
		formationRepository.save(formation);
	}

}
