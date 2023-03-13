package com.revature.springexercise.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "emp_table")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="first_Name")
    private String firstName;
    @Column(name ="last_Name")
    private String lastName;
    private String title;
    private String email;

    public Employee(String firstName, String lastName, String title, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.email = email;
    }
}
