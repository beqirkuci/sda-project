package com.sda.orders.orders.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    private String surname;

    private LocalDate birthDate;

    private String email;

    public Student() {
    }
}
