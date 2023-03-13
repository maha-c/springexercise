package com.revature.springexercise.service;

import com.revature.springexercise.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee insert(Employee employee);

    Employee getById(Long id);


    List<Employee> getAll();


    Employee update(Employee employee);

    boolean delete(Long id);

    List<Employee> getAll(String title);

    List<Employee> findByfirstName(String firstName);

}
