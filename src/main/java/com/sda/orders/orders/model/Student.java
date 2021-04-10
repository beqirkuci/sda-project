package com.sda.orders.orders.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
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

    @ManyToOne(optional = false)
    private Departament departament;
    public Student() {
    }
}
