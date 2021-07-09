package com.dockertest.docker.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "boot_emp")
public class Employee
{
    @Id
    @GeneratedValue
    @Column(name = "record_id")
    private Long   id;
    @Column(name = "emp_id")
    private long   empId;
    @Column(name = "emp_name")
    private String name;
    @Column(name = "emp_address")
    private String address;
    @Column(name = "emp_dept")
    private String empDept;

    public long getEmpId()
    {
        return empId;
    }

    public void setEmpId( long empId )
    {
        this.empId = empId;
    }

    public Long getId()
    {
        return id;
    }

    public void setId( Long id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress( String address )
    {
        this.address = address;
    }

    public String getEmpDept()
    {
        return empDept;
    }

    public void setEmpDept( String empDept )
    {
        this.empDept = empDept;
    }
}
