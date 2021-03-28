package com.sda.orders.orders.repository;
import com.sda.orders.orders.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
