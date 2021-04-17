package com.sda.orders.orders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThrowingController {

    @GetMapping("/boom")
    public String shouldThrow() {
        throw new RuntimeException("Boom...");
    }
}