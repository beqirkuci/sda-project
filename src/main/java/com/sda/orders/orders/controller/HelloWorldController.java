package com.sda.orders.orders.controller;

import com.sda.orders.orders.config.PropertyConfiguration;
import com.sda.orders.orders.model.Student;
import com.sda.orders.orders.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    private final StudentService studentService;



    private static Logger LOG = LoggerFactory
            .getLogger(HelloWorldController.class);

    public HelloWorldController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("students")
    public ResponseEntity<List<Student>> getStudent() {

        return new ResponseEntity<List<Student>>(studentService.studentList(),
                HttpStatus.CREATED);

}




    @GetMapping("student/{email}")
    /*
     * Krijoni nje metode ne studentService E cila merr te dhena nga application.properties dhe gjen studentin by Email
     * Perdorni Student si endpoint
     * */
    public Integer getMessagge(@RequestParam Integer number1,@RequestParam Integer number2){
        return number1+ number2;
    }



    /*
     * Krijoni nje Medote te re POST e cila krijon nje student dhe kthen listen e studenteve qe ndodhen ne sistem
     * Pra krijo nje student dhe kthe nje array me sudentet qe ndodhen ne Properties file
     * Perdorni Student si endpoint
     * */

}
