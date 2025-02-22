package com.lyotard.Simple.CRUD.Employee.Project.Service;


import com.lyotard.Simple.CRUD.Employee.Project.Entity.Employee;
import com.lyotard.Simple.CRUD.Employee.Project.Repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;



    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByFirstNameAsc();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);

        if (result.isPresent()) {
            return result.get();
        }
        else {

            throw new RuntimeException("Didn't find employee with this id: " + theId);
        }
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}






