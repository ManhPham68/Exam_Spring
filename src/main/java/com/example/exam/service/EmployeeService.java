package com.example.exam.service;

import com.example.exam.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService  {
    List<EmployeeEntity> getAllEmployee();
    EmployeeEntity saveEmployee(EmployeeEntity employee);
}
