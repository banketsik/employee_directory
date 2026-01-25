package com.springboot.employee_directory.controller;

import com.springboot.employee_directory.entity.Employee;
import com.springboot.employee_directory.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // Add mapping for "/list"

    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        // Get the employee from DataBase.

        List<Employee> employeeList = employeeService.findAll();

        // Add to the Spring Model.

        theModel.addAttribute("employees", employeeList);

        // Name of the view page that will return this to.
        return "employees/list-employees";
    }

    // Add mapping for a showFormForAdd

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {

        // Create Model attribute to bind form data.
        Employee theEmployee = new Employee();

        // Thymeleaf template will access this data for binding form data.
        model.addAttribute("employee", theEmployee);

        // Return in the root template.
        return "/employees/employee-form";
    }

    // Add mapping for a showFormForUpdate

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int id, Model model) {

        // Get the Employee from the Service. Identifier argument that was passed in the form embedded link.
        Employee theEmployee = employeeService.findById(id);

        // Set Employee in the model to prepopulate the form.
        model.addAttribute("employee", theEmployee);

        // Send over to our root form.
        // This line of return form template for our update
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {

        // Save the employee.
        employeeService.save(employee);

        // Use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int id) {

        // Delete the Employee.
        employeeService.deleteById(id);

        // Redirect to root /employees/list
        return "redirect:/employees/list";

    }
}
