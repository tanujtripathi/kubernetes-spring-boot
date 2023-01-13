package com.kubernetes.learning.kuberneteslearning.controllers;

import com.kubernetes.learning.kuberneteslearning.entity.Employee;
import com.kubernetes.learning.kuberneteslearning.handlers.EmployeeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeHandler handler;

    @GetMapping("/health")
    public String health() {
        return "Service is Up";
    }

    @PostMapping("/saveEmployee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return handler.saveEmployee(employee);
    }

}
