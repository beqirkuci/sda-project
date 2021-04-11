package com.sda.orders.orders.controller;
import com.sda.orders.orders.model.Student;
import com.sda.orders.orders.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("students")
    public ResponseEntity<List<Student>> getStudent() {
        return new ResponseEntity<List<Student>>(studentService.studentList(),
                HttpStatus.OK);
    }

    @PostMapping("students")
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student) {
        return new ResponseEntity<Student>(studentService.addStudent(student),
                HttpStatus.CREATED);
    }

    @PutMapping("students")
    public ResponseEntity<Student> updateStudent(@Valid @RequestBody Student student) {
        return new ResponseEntity<Student>(studentService.updateStudent(student),
                HttpStatus.OK);
    }

    @DeleteMapping("students/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<String>(HttpStatus.OK);
    }
    @GetMapping("studentsbydepartment/{depName}")
    public List<Student> getstudentsByDepName(@PathVariable String depName){

      return studentService.getstudentsByDepName(depName);

    }


}
