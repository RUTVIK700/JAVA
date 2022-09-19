/*
 * Creation : 7 Jul 2022
 */
package com.springrest.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.restapi.entity.Department;
import com.springrest.restapi.entity.Employee;
import com.springrest.restapi.service.DepartmentService;
import com.springrest.restapi.service.EmployeeService;

@RestController
public class Controller {
    @Autowired
    private DepartmentService depser;

    @Autowired
    private EmployeeService empser;

    @GetMapping("/home")
    public String hello() {
        return "Hello Welcome User";

    }

    @GetMapping("/emp")
    public List<Employee> emp() {
        return this.empser.getemployee();
    }

    @GetMapping("/emp/{id}")
    public Optional<Employee> empid(@PathVariable String id) {
        return this.empser.getemployeeid(Long.parseLong(id));
    }

    @PostMapping("/emp")
    public Employee addemp(@RequestBody Employee emp) {
        return this.empser.addemp(emp);
    }

    @PutMapping("/emp")
    public Employee updateemp(@RequestBody Employee emp) {
        return this.empser.updateemp(emp);
    }

    @DeleteMapping("/emp/{id}")
    public Employee removeemp(@PathVariable String id) {
        return this.empser.removeid(Long.parseLong(id));

    }

    @PostMapping("/dep")
    public Department adddep(@RequestBody Department dep) {
        return this.depser.adddep(dep);
    }

}
