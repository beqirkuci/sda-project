package com.sda.orders.orders.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class Student {
    private String name;
    private String surname;
    private Date birthDate;
    private String email;

}
