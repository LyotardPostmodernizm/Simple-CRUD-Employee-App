package com.lyotard.Simple.CRUD.Employee.Project.Service;
import com.lyotard.Simple.CRUD.Employee.Project.Entity.Employee;


import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
