package com.kubernetes.learning.kuberneteslearning.handlers;

import com.kubernetes.learning.kuberneteslearning.entity.Employee;
import com.kubernetes.learning.kuberneteslearning.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeHandler {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
