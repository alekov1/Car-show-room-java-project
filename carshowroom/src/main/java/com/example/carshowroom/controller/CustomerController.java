package com.example.carshowroom.controller;

import com.example.carshowroom.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;


    @GetMapping("/customer")
    public String customers(@RequestParam(name = "firstName", required = false) String firstName, Model model) {
        model.addAttribute("customers", customerService.listCustomer(firstName));
        return "customers";
    }
}
