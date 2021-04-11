package com.sda.orders.orders.repository;

import com.sda.orders.orders.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  DepartmentRepository extends JpaRepository<Department,Integer> {
}
