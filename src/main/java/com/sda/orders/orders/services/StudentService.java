package com.sda.orders.orders.services;

import com.sda.orders.orders.config.PropertyConfiguration;
import com.sda.orders.orders.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class StudentService {

    private final PropertyConfiguration propertyConfiguration;

    public StudentService(PropertyConfiguration propertyConfiguration) {
        this.propertyConfiguration = propertyConfiguration;
    }

    public List<Student> studentList(){
        return Arrays.asList(getBuild(0),getBuild(1), getBuild(2));
    }

    private Student getBuild(int i) {
        return Student.builder()
                .name(propertyConfiguration.getNames().get(i))
                .surname(propertyConfiguration.getSurnames().get(i))
                .birthDate(LocalDate.parse(propertyConfiguration.getBirthDates().get(i)))
                .email(propertyConfiguration.getEmails().get(i)).build();
    }
}
