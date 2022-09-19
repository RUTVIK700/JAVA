/*
 * Creation : 18 Jul 2022
 */
package com.springrest.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.restapi.dao.DepartmentDao;
import com.springrest.restapi.entity.Department;

@Service
public class DeparmentServiceImplemented implements DepartmentService {
    @Autowired
    DepartmentDao depdao;

    /**
     * {@inheritDoc}
     * 
     * @see com.springrest.restapi.service.DepartmentService#adddep(com.springrest.restapi.entity.Department)
     */
    @Override
    public Department adddep(Department dep) {
        return depdao.save(dep);
    }
}
