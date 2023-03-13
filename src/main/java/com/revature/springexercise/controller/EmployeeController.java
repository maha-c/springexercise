package com.revature.springexercise.controller;
import com.revature.springexercise.entity.Employee;
import com.revature.springexercise.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping()
    public Employee insert(@RequestBody Employee employee) {
        return employeeService.insert(employee);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Employee> getAll(@RequestParam(required = false, value = "title") String title) {
        if (title == null) return employeeService.getAll();
        else return employeeService.getAll(title);
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable("id") Long id) {
        return employeeService.getById(id);
    }

    @GetMapping("/name/{firstName}")
    public List<Employee> getByName(@PathVariable("firstName") String firstName) {
        return employeeService.findByfirstName(firstName);
    }
  /*  @GetMapping("/{empIdentifier}")
    public Employee getByIdOrName(@PathVariable("empIdentifier") String identifier) {
        try {
            Long id = Long.parseLong(identifier);
            return employeeService.getById(id);
        } catch(Exception e) {
            return employeeService.findByName(identifier).get(0);
        }
    }*/

    @PutMapping()
    public Employee update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id){

        return employeeService.delete(id);
    }
}