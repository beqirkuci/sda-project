package com.sda.orders.orders.controller;
import com.sda.orders.orders.model.Users;
import com.sda.orders.orders.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("register")
    public Users createUser(@RequestBody Users users) {
        return userService.create(users);
    }

    @GetMapping ("register")
    public String get() {
        return "hello Brand";
    }

}
