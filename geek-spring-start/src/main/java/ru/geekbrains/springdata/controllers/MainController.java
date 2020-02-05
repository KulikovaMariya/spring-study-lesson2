package ru.geekbrains.springdata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/welcome")
public class MainController {
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
}
