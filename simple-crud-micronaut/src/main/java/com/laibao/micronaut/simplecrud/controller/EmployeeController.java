package com.laibao.micronaut.simplecrud.controller;

import com.alibaba.fastjson.JSONObject;
import com.laibao.micronaut.simplecrud.domain.Employee;
import com.laibao.micronaut.simplecrud.service.EmployeeService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

import javax.inject.Inject;
import javax.validation.constraints.Size;

@Controller("/employee")
public class EmployeeController {

    @Inject
    EmployeeService employeeService;

    @Get("/")
    public String index() {
        return "Hello world,jinge 金戈";
    }

    /**
     * Add Employee service endpoint
     * @param employee
     * @return JSONObject
     */
    @Produces(MediaType.APPLICATION_JSON)
    @Post("/addEmployee")
    public JSONObject addEmployee(@Body @Size(max = 1024) Employee employee) {

//        url: http://localhost:8080/employee/addEmployee
//        JSON格式的测试数据如下:
//        {
//            "name":"金戈",
//            "salary":20000
//        }
//        测试结果: OK
        return 	employeeService.saveOrUpdateEmployee(employee);
    }

    /**
     * Get Single Employee service Endpoint
     * @param id
     * @return JSONObject
     */
    @Produces(MediaType.APPLICATION_JSON)
    @Get("/getEmployee")
    public JSONObject getEmployee(@QueryValue("id") long id) {

//        url: http://localhost:8080/employee/getEmployee?id=1004
//        测试结果: OK
//        {
//            "data": {
//            "id": 1004,
//                    "name": "金戈4",
//                    "salary": 10000
//        },
//            "status": "success"
//        }
        return employeeService.getEmployeeId(id);
    }

    /**
     * Get All Employees Service Endpoint
     * @return JSONObject
     */
    @Produces(MediaType.APPLICATION_JSON)
    @Get("/getEmployees")
    public JSONObject getEmployees() {

//        url: http://localhost:8080/employee/getEmployees

//        测试结果: OK
//        {
//            "data": [
//            {
//                "id": 1004,
//                    "name": "金戈4",
//                    "salary": 10000
//            },
//            {
//                "id": 1003,
//                    "name": "金戈3",
//                    "salary": 10000
//            },
//            {
//                "id": 1002,
//                    "name": "金戈2",
//                    "salary": 10000
//            },
//            {
//                "id": 1001,
//                    "name": "金戈1",
//                    "salary": 10000
//            },
//            {
//                "id": 1000,
//                    "name": "金戈0",
//                    "salary": 10000
//            }
//    ],
//            "status": "success"
//        }

        JSONObject jsonObject = employeeService.getEmployees();
        return jsonObject;
    }

    /**
     * Update Employee details service Endpoint
     * @param employee
     * @return JSONObject
     */
    @Produces(MediaType.APPLICATION_JSON)
    @Post("/updateEmployee")
    public JSONObject updateEmployee( @Size(max = 1024) @Body Employee employee ) {
        return employeeService.saveOrUpdateEmployee(employee);
    }

    /**
     * Delete specific Employee service Endpoint
     * @param id
     * @return JSONObject
     */
    @Produces(MediaType.APPLICATION_JSON)
    @Get("/deleteEmployee")
    public JSONObject deleteEmployee(@QueryValue("id") long id) {
        return employeeService.deleteEmployee(id);
    }
}
