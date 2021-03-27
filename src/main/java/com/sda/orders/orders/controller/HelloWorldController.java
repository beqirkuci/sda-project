package com.sda.orders.orders.controller;
import com.sda.orders.orders.model.Student;
import com.sda.orders.orders.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class HelloWorldController {

    private final StudentService studentService;

    private static Logger LOG = LoggerFactory
            .getLogger(HelloWorldController.class);

    public HelloWorldController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("student")
    public List<Student> getStudent() {


        return studentService.studentList();
}


    @GetMapping("receivePayment")
    public Integer getMessagge(@RequestParam Integer number1,@RequestParam Integer number2){
        return number1+ number2;
    }

}
