package com.sda.orders.orders.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String surname;

    private LocalDate birthDate;

    private String email;

    @ManyToOne(optional = false)
    private Department department;

    public Student() {
    }
}
