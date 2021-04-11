package com.sda.orders.orders.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
    @GetMapping("user")
    public String hello() {
        return "Hello User";
    }

    @GetMapping("admin")
    public String hi() {
        return "Hello ADMIN";
    }




}
