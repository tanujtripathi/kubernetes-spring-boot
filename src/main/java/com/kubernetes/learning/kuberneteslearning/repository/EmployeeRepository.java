package com.kubernetes.learning.kuberneteslearning.repository;

import com.kubernetes.learning.kuberneteslearning.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
