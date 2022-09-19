/*
 * Creation : 7 Jul 2022
 */
package com.springrest.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.restapi.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
