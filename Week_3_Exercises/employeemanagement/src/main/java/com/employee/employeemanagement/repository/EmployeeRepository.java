package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.entity.Employee;
import com.example.employeemanagementsystem.dto.EmployeeDTO;
import com.example.employeemanagementsystem.projection.EmployeeProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Page<Employee> findAll(Pageable pageable);

    @Query("SELECT e.id as id, e.name as name, e.email as email, d.name as departmentName " +
           "FROM Employee e JOIN e.department d")
    List<EmployeeProjection> findAllProjectedBy();

    @Query("SELECT new com.example.employeemanagementsystem.dto.EmployeeDTO(e.id, e.name, e.email, d.name) " +
           "FROM Employee e JOIN e.department d")
    List<EmployeeDTO> findAllEmployeeDTOs();
}
