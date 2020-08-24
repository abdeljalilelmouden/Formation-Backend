package com.application.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.api.entity.RoleEntity;

/**
 * @interface RoleRepository
 * @author ABDELJALIL EL MOUDEN
 * @creation 23/08/2020
 * @version 1.0.0
 * @see elmoudene123@gmail.com
 * 
 * */

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long>{

}
