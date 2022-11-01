package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {

    @GetMapping("/admin")
    public String goToAdmin() {
        return "adminPages/admin";
    }

    @GetMapping("/user")
    public String gotToUser() {
        return "userPages/user";
    }
}