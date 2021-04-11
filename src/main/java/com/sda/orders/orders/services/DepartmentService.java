package com.sda.orders.orders.services;

import com.sda.orders.orders.repository.DepartmentRepository;
import com.sda.orders.orders.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department create(Department dep) {

        return departmentRepository.save(dep);
    }
}
