package com.springboot.employee_directory.dao;

import com.springboot.employee_directory.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Add a method to sort by Last Name.
    public List<Employee> findAllByOrderByLastNameAsc();

}
