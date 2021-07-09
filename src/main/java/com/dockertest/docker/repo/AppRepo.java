package com.dockertest.docker.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dockertest.docker.pojo.Employee;

@Repository
public interface AppRepo extends JpaRepository<Employee, Long>
{
    @Query("select e from Employee e where empId = :empId")
    List<Employee> findByEmpId(long empId);

    List<Employee> findById(long id);
}
