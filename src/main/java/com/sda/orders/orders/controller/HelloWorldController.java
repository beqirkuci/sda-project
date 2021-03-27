package com.sda.orders.orders.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billing/")
public class HelloWorldController {

    @GetMapping("activate")
    public String getMessagge(@RequestParam(value = "test", required = false) String test) {

        try {
            test.trim();
            return "ok";
        } catch (NullPointerException e) {
            return "EX";
        }

    }


    @GetMapping("receivePayment")
    public Integer getMessagge(@RequestParam Integer number1,@RequestParam Integer number2){
        return number1+ number2;
    }

}
