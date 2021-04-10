package com.sda.orders.orders.services;

import com.sda.orders.orders.config.PropertyConfiguration;
import com.sda.orders.orders.model.Student;
import com.sda.orders.orders.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final PropertyConfiguration propertyConfiguration;
    @Autowired
    private StudentRepository studentRepository;

    public StudentService(PropertyConfiguration propertyConfiguration
                  ) {
        this.propertyConfiguration = propertyConfiguration;

    }

    public List<Student> studentList(){
        return (List<Student>) studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        // call repository and save
      return  studentRepository.save(student);
    }
}
