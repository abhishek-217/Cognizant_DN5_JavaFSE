package com.cognizant.employee_rest_service.service;

import com.cognizant.employee_rest_service.dao.DepartmentDao;
import com.cognizant.employee_rest_service.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    public ArrayList<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}