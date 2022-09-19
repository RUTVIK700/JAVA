/*
 * Creation : 18 Jul 2022
 */
package com.springrest.restapi.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deptid;
    private String deptnmae;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "deptid", referencedColumnName = "deptid")
    private List<Employee> emp;

    public Department(long deptid, String deptnmae, List<Employee> emp) {
        super();
        this.deptid = deptid;
        this.deptnmae = deptnmae;
        this.emp = emp;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    public Department() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Department [deptid=" + deptid + ", deptnmae=" + deptnmae + ", emp=" + emp + "]";
    }

    public Department(long deptid, String deptnmae) {
        super();
        this.deptid = deptid;
        this.deptnmae = deptnmae;
    }

    public long getDeptid() {
        return deptid;
    }

    public void setDeptid(long deptid) {
        this.deptid = deptid;
    }

    public String getDeptnmae() {
        return deptnmae;
    }

    public void setDeptnmae(String deptnmae) {
        this.deptnmae = deptnmae;
    }

}
