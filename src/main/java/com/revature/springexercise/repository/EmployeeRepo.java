package com.revature.springexercise.repository;
import com.revature.springexercise.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

//    @Query(value = "SELECT * FROM emp_table WHERE emp_Name = 'Tom'", nativeQuery = true)
//    public List<Employee> findEmployees();

    List<Employee> findByfirstName(String firstName);


    List<Employee> findByTitle(String manager);
}
