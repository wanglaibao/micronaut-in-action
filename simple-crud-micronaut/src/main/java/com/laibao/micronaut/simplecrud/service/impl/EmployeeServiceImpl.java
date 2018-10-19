package com.laibao.micronaut.simplecrud.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.laibao.micronaut.simplecrud.domain.Employee;
import com.laibao.micronaut.simplecrud.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.util.*;
import java.util.stream.Collectors;

@Singleton
public class EmployeeServiceImpl implements EmployeeService{
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    private static Map<String,Employee> employeeMap = new HashMap<>();

    static {
        Employee employee0 = new Employee();
        employee0.setId(1000);
        employee0.setName("金戈0");
        employee0.setSalary(10000);

        Employee employee1 = new Employee();
        employee1.setId(1001);
        employee1.setName("金戈1");
        employee1.setSalary(10000);

        Employee employee2 = new Employee();
        employee2.setId(1002);
        employee2.setName("金戈2");
        employee2.setSalary(10000);

        Employee employee3 = new Employee();
        employee3.setId(1003);
        employee3.setName("金戈3");
        employee3.setSalary(10000);

        Employee employee4 = new Employee();
        employee4.setId(1004);
        employee4.setName("金戈4");
        employee4.setSalary(10000);

        employeeMap.put("1000",employee0);
        employeeMap.put("1001",employee1);
        employeeMap.put("1002",employee2);
        employeeMap.put("1003",employee3);
        employeeMap.put("1004",employee4);
    }

    private static ObjectMapper mapper = new ObjectMapper();

    public static final String MESSAGE = "message";

    public static final String STATUS  = "status";

    public static final String ERROR   = "error";

    public static final String SUCCESS = "success";

    @Override
    public JSONObject getEmployeeId(long empId) {
        JSONObject jsonObject = new JSONObject();
        try {
            Employee employee = employeeMap.get(String.valueOf(empId));
            if ( employee != null) {
                jsonObject.put("data", employee);
            } else {
                jsonObject.put(EmployeeServiceImpl.MESSAGE, "Requested Employee doesn't exist in System.");
            }
            jsonObject.put(EmployeeServiceImpl.STATUS, EmployeeServiceImpl.SUCCESS);
        } catch (Exception ex) {
            jsonObject.put(EmployeeServiceImpl.STATUS, EmployeeServiceImpl.ERROR);
            jsonObject.put(EmployeeServiceImpl.MESSAGE, "Exception occurred while getting the Employee : "+ex.getMessage());
            LOGGER.error("Exception occurred while getting the Employee : "+ex.getMessage());
        }
        return jsonObject;
    }

    @Override
    public JSONObject getEmployees() {
        JSONObject jsonObject = new JSONObject();
        try {
            List<Employee> employeeList = employeeMap.values().stream().collect(Collectors.toList());
            if ( employeeList != null) {
                jsonObject.put("data", employeeList);
            } else {
                jsonObject.put(EmployeeServiceImpl.MESSAGE, "There are no employees exist in System.");
            }
            jsonObject.put(EmployeeServiceImpl.STATUS, EmployeeServiceImpl.SUCCESS);
        } catch (Exception ex) {
            jsonObject.put(EmployeeServiceImpl.STATUS, EmployeeServiceImpl.ERROR);
            jsonObject.put(EmployeeServiceImpl.MESSAGE, "Exception occurred while getting the Employees : "+ex.getMessage());
            LOGGER.error("Exception occurred while getting the Employees : "+ex.getMessage());
        }
        return jsonObject;
    }

    @Override
    public JSONObject saveOrUpdateEmployee(Employee employee) {
        JSONObject jsonObject = new JSONObject();
        long beforeSaveEmpId    = employee.getId();
        try {
            long afterSaveEmpId = new Random().nextInt(100);
            if ( beforeSaveEmpId == 0) {
                jsonObject.put("EmpId", afterSaveEmpId);
                jsonObject.put(EmployeeServiceImpl.MESSAGE, "Employee created successfully");
            } else if (afterSaveEmpId > 0) {
                jsonObject.put("EmpId", afterSaveEmpId);
                jsonObject.put(EmployeeServiceImpl.MESSAGE, "Employee updated successfully");
            } else {
                jsonObject.put(EmployeeServiceImpl.MESSAGE, "Requested employee doesn't exist in the System.");
            }
        } catch (Exception ex) {
            jsonObject.put(EmployeeServiceImpl.STATUS, EmployeeServiceImpl.ERROR);
            jsonObject.put(EmployeeServiceImpl.MESSAGE, "Exception occurred while adding/updating the Employee : "+ex.getMessage());

            LOGGER.error("Exception occurred while adding/updating the Employee : "+ex.getMessage());
        }
        return jsonObject;
    }

    @Override
    public JSONObject deleteEmployee(long empId) {
        JSONObject jsonObject = new JSONObject();
        boolean isEmpDeleted   = false;
        try {
            Employee employee = employeeMap.get(String.valueOf(empId));
            jsonObject.put(EmployeeServiceImpl.STATUS, EmployeeServiceImpl.SUCCESS);
            if ( employee != null ) {
                isEmpDeleted = true;
                if (isEmpDeleted) {
                    jsonObject.put(EmployeeServiceImpl.MESSAGE, "Employee has been deleted successfully");
                    jsonObject.put("empId", empId);
                } else {
                    jsonObject.put(EmployeeServiceImpl.MESSAGE, "Failed to delete the Employee ");
                    return jsonObject;
                }
            } else {
                jsonObject.put(EmployeeServiceImpl.MESSAGE, "Requested Employee doesn't exist in the System. Employee ID : "+empId);
            }
        } catch (Exception ex) {
            jsonObject.put(EmployeeServiceImpl.STATUS, EmployeeServiceImpl.ERROR);
            jsonObject.put(EmployeeServiceImpl.MESSAGE, "Exception occurred while deleting the Employee : "+ex.getMessage());

            LOGGER.error("Exception occurred while deleting the Employee : "+ex.getMessage());
        }
        return jsonObject;
    }
}
