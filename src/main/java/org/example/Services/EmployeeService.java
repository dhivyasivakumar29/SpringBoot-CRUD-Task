package org.example.Services;

import org.example.Entity.Employee;
import org.example.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
     EmployeeRepository repository;

        public Employee addEmployee(Employee emp) {
            return repository.save(emp);
        }

        public List<Employee> getEmployee() {
            return repository.findAll();
        }

        public Employee getEmployee(Integer id) {
            return repository.findById(id).orElse(null);
        }

        public Employee updateEmployee(Employee emp) {
            return repository.save(emp);
        }

        public void deleteEmployee(Integer id) {
            repository.deleteById(id);
        }
    public List<Employee> getEmployeeByDepartment(String department) {
        return repository.findByDepartment(department);
    }
    }




