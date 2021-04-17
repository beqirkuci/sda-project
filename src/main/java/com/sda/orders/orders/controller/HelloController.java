package com.sda.orders.orders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("/hello")
    public String showHello(final Model modelMap) {
        modelMap.addAttribute("brand", "hello in thymeleaf from model map");




        return "welcome";
    }
}
