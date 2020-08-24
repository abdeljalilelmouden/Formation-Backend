package com.application.api.service;

import java.util.List;

import com.application.api.entity.RoleEntity;

/**
 * @interface IRoleService
 * @author ABDELJALIL EL MOUDEN
 * @creation 23/08/2020
 * @version 1.0.0
 * @see elmoudene123@gmail.com
 * 
 * */

public interface IRoleService {
	
	/**
	 * get all role
	 * @param
	 * @return
	 */
	public List<RoleEntity> getAllRoles();
	
	/**
	 * get role by id
	 * @param idRole
	 * @return 
	 */
	public RoleEntity getRoleById(Long idRole);
	
	/**
	 * delete role
	 * @param roleEntity
	 * @return 
	 */
	public void deteleRole(RoleEntity roleEntity);
	
	/**
	 * add role
	 * @param roleEntity
	 * @return RoleEntity
	 */
	public RoleEntity addRole(RoleEntity roleEntity);
	
	/**
	 * update role
	 * @param roleEntity
	 * @return RoleEntity
	 */
	public RoleEntity updateRole(RoleEntity roleEntity);

}
