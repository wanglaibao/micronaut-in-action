package com.laibao.micronaut.simplecrud.service;


import com.alibaba.fastjson.JSONObject;
import com.laibao.micronaut.simplecrud.domain.Employee;

public interface EmployeeService {
    JSONObject getEmployeeId(long empId);
    JSONObject getEmployees();
    JSONObject saveOrUpdateEmployee(Employee employee);
    JSONObject deleteEmployee(long empId);
}
