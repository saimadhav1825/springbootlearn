package com.sai.springbootdemo.service;

import java.util.List;

import com.sai.springbootdemo.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employee, long id);
    void deleteEmployee(long id);
    List<Employee> paginationList(int offset,int pageSize);


}