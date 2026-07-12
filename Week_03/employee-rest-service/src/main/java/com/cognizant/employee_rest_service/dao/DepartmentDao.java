package com.cognizant.employee_rest_service.dao;


import com.cognizant.employee_rest_service.model.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DepartmentDao {

    private static ArrayList<Department> DEPARTMENT_LIST;

    public DepartmentDao() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("employee.xml");

        DEPARTMENT_LIST = new ArrayList<>();

        DEPARTMENT_LIST.add(context.getBean("itDepartment", Department.class));
        DEPARTMENT_LIST.add(context.getBean("hrDepartment", Department.class));
    }

    public ArrayList<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}