package com.sda.orders.orders.controller;


import com.sda.orders.orders.model.Department;
import com.sda.orders.orders.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;



    @PostMapping("department")
    public Department create(@Valid @RequestBody Department dep){

        Department createdDEP= departmentService.create(dep);
       return createdDEP;

    }




}
