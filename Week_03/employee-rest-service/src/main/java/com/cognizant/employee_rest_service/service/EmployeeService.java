package com.cognizant.employee_rest_service.service;


import com.cognizant.employee_rest_service.dao.EmployeeDao;
import com.cognizant.employee_rest_service.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public ArrayList<Employee> getAllEmployees() {

        return employeeDao.getAllEmployees();

    }

}