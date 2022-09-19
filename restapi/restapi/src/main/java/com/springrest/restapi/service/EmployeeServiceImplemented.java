/*
 * Creation : 7 Jul 2022
 */
package com.springrest.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.restapi.dao.EmployeeDao;
import com.springrest.restapi.entity.Employee;

@Service
public class EmployeeServiceImplemented implements EmployeeService {
    @Autowired
    private EmployeeDao empdao;
    List<Employee> list;

    public EmployeeServiceImplemented() {
        /*
         * list = new ArrayList<>(); list.add(new Employee(1, "rutvik", "IT"));
         */}

    @Override
    public List<Employee> getemployee() {
        return empdao.findAll();
        // return list;
    }

    @Override
    public Optional<Employee> getemployeeid(Long id) {
        return empdao.findById(id);
        /*
         * Employee c = null; for (Employee i : list) { if (i.getId() == id) { c = i; break; } } return c;
         */}

    @Override
    public Employee addemp(Employee emp) {
        return empdao.save(emp);
        /*
         * list.add(emp); return emp;
         */}

    @Override
    public Employee updateemp(Employee emp) {
        return empdao.save(emp);
        /*
         * Employee c = null; for (Employee i : list) { if (emp.getId() == i.getId()) { i.setDepartment(emp.getDepartment());
         * i.setName(emp.getName()); c = i; break; } } return c;
         */}

    @Override
    public Employee removeid(long id) {
        Employee entity = empdao.getReferenceById(id);
        empdao.delete(entity);
        return null;
        /*
         * for (Employee i : list) { if (i.getId() == id) { list.remove(i); break; } } return null;
         */}

}
