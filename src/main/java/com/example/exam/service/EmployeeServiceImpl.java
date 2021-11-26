package com.example.exam.service;

import com.example.exam.entity.EmployeeEntity;
import com.example.exam.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
   @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employee) {
        return employeeRepo.save(employee);
    }
}
