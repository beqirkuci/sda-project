package com.sda.orders.orders.controller;

import com.sda.orders.orders.model.OrderForm;
import org.hibernate.mapping.Collection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.awt.*;
import java.util.Arrays;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/create")
    public String showOrderForm(final ModelMap modelMap) {
       // modelMap.addAttribute("orderForm", new OrderForm("test",5));
       //  modelMap.addAttribute("elements", Arrays.asList("foo", "bar"));;
        return "order";
    }

    @PostMapping("/create")
    public String handleNewOrder(@Valid @ModelAttribute("orderForm") final OrderForm orderForm, final Errors errors) {
        // handle new Order here
        if (errors.hasErrors()) {
            return "order";
        }
        return "redirect:/hello";
    }
}