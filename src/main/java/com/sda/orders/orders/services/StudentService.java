package com.sda.orders.orders.services;

import com.sda.orders.orders.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StudentService {

    public List<Student> studentList(){
        List<Student> students = new ArrayList<>();

        Student student1 = Student.builder()
                .name("Brand")
                .surname("test")
                .birthDate(new Date())
                .email("test@gmail.com").build();

        Student student2 = Student.builder()
                .name("Armand")
                .surname("Kodheli")
                .birthDate(new Date())
                .email("mand@gmail.com").build();

        Student student3 = Student.builder()
                .name("Papi")
                .surname("Culo")
                .birthDate(new Date())
                .email("papi@gmail.com").build();

        students.add(student1);
        students.add(student2);
        students.add(student3);

        return students;
    }
}
