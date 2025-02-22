package com.lyotard.Simple.CRUD.Employee.Project.Repository;

import com.lyotard.Simple.CRUD.Employee.Project.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByOrderByFirstNameAsc();

}
