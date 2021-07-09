package com.dockertest.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dockertest.docker.pojo.Employee;
import com.dockertest.docker.repo.AppRepo;

@Service
public class AppService
{
    @Autowired AppRepo repo;
    
    public List<Employee> getEmpById( long empId )
    {
        System.out.println( empId );
        return repo.findByEmpId( empId );
    }
    
    public List<Employee> getEmpByRecordId( long id )
    {
        return repo.findById( id );
    }
    
    public List<Employee> getAllEmp()
    {
        return repo.findAll();
    }
}
