package com.revature.springexercise.service;
import com.revature.springexercise.entity.Employee;
import com.revature.springexercise.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee insert(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getById(Long id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public boolean delete(Long id) {
        boolean foundemp = employeeRepo.existsById(id);
        if(foundemp) employeeRepo.deleteById(id);
        return foundemp;
    }

    @Override
    public List<Employee> getAll(String title) {
        switch (title) {
            case "Manager":
                return employeeRepo.findByTitle("Manager");
            case "Web Developer":
                return employeeRepo.findByTitle("Web Developer");
            case "Data Analyst":
                return employeeRepo.findByTitle("Data Analyst");
            default:
                return employeeRepo.findAll();
        }
    }

    @Override
    public List<Employee> findByfirstName(String firstName) {
        return employeeRepo.findByfirstName(firstName);
    }
}
