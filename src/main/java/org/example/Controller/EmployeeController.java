package org.example.Controller;

import org.example.Entity.Employee;
import org.example.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController
{
    @Autowired
    EmployeeService service;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee emp) {
        return service.addEmployee(emp);
        }

        @GetMapping
        public List<Employee> getEmployees() {
            return service.getEmployee();
        }

        @GetMapping("/{id}")
        public Employee getEmployee(@PathVariable("id") Integer id) {
            return service.getEmployee(id);
        }

        @PutMapping
        public Employee updateEmployee(@RequestBody Employee emp) {
            return service.updateEmployee(emp);
        }

        @DeleteMapping("/{id}")
        public void deleteEmployee(@PathVariable("id") Integer id) {
            service.deleteEmployee(id);
        }

        @GetMapping("/department/{department}")
        public List<Employee> getEmployeeByDepartment(
            @PathVariable("department1") String department) {

           return service.getEmployeeByDepartment(department);
    }
        
    }

