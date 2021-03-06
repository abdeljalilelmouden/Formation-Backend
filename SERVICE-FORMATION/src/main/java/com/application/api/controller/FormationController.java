package com.application.api.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.api.dto.FormationDto;
import com.application.api.entity.FormationEntity;
import com.application.api.service.impl.FormationService;
 

/**
 * @class FormationController
 * @author ABDELJALIL EL MOUDEN
 * @creation 20/08/2020
 * @version 1.0.0
 * @see elmoudene123@gmail.com
 * 
 * */
@RequestMapping(value = "/formation")
@RestController
public class FormationController {
	
	private static final Logger logger = LogManager.getLogger(FormationController.class);	
	
	@Autowired
	private FormationService formationService;
	
	
	/**
	 * @return  Get All Formation
	 * @param 
	 */
	@GetMapping(value = "/v0")
	public List<FormationDto> getAllFormation(){
		
		if(logger.isInfoEnabled()) {
			logger.info("get All Formation");
		}
		return FormationDto.entitiesToDtos(formationService.getAllFormations());
	}
	
	/**
	 * @return  get one Formation  
	 * @param formationEntity
	 * @throws Exception 
	 */
	@GetMapping(value = "/v0/{idFormation}")
	public FormationDto getFormationById(@PathVariable(name = "idFormation") Long idFormation){
		
		if(logger.isInfoEnabled()) {
			logger.info("get one Formation");
		}
		return FormationDto.entityToDto(formationService.getFormationById(idFormation));
	}
	/**
	 * @return  add Formation
	 * @param formationEntity
	 */
	@PostMapping(value = "/v0")
	public FormationEntity addFormation(@RequestBody FormationEntity formationEntity){
		
		if(logger.isInfoEnabled()) {
			logger.info("Add Formation");
		}
		return FormationDto.dtoToEntity(FormationDto.entityToDto(formationService.addFormation(formationEntity)));
	}
	
	/**
	 * @return  delete Formation by Id
	 * @param formationEntity
	 */
	@DeleteMapping(value = "/v0")
	public void deleteFormation(@RequestBody FormationEntity formationEntity){
		
		if(logger.isInfoEnabled()) {
			logger.info("Delete  Formation");
		}
		formationService.deteleFormation(formationEntity);
	}
	
	/**
	 * @return  update Formation  
	 * @param formationEntity
	 */
	@PutMapping(value = "/v0")
	public FormationEntity updateFormation(@RequestBody FormationEntity formationEntity){
		
		if(logger.isInfoEnabled()) {
			logger.info("Update Formation");
		}
		
		return FormationDto.dtoToEntity(FormationDto.entityToDto(formationService.updateFormation(formationEntity)));
		
		
	}

	

}
