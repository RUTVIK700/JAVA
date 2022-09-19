/*
 * Creation : 18 Jul 2022
 */
package com.springrest.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.restapi.entity.Department;

public interface DepartmentDao extends JpaRepository<Department, Long> {

}
