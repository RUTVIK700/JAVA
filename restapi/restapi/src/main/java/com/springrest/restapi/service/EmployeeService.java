/*
 * Creation : 7 Jul 2022
 */
package com.springrest.restapi.service;

import java.util.List;
import java.util.Optional;

import com.springrest.restapi.entity.Employee;

public interface EmployeeService {
    public List<Employee> getemployee();

    public Optional<Employee> getemployeeid(Long id);

    public Employee addemp(Employee emp);

    public Employee updateemp(Employee emp);

    public Employee removeid(long id);
}
