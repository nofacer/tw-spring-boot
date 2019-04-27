package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
 


@RestController
public class EmployeeController {
    private List<Employee> employeeList = new ArrayList<Employee>();

    {
        employeeList.add(new Employee(1, "小明", 20, "男"));
        employeeList.add(new Employee(2, "小红", 19, "女"));
        employeeList.add(new Employee(3, "小智", 15, "男"));
        employeeList.add(new Employee(4, "小刚", 16, "男"));
        employeeList.add(new Employee(5, "小霞", 15, "女"));
    }

    @RequestMapping("/employees")
    public List<Employee> findAll() {
        return employeeList;
    }
}