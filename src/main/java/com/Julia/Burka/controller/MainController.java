package com.Julia.Burka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.ui.Model;

@RestController
@RequestMapping(value="/")
@Controller
public class MainController {
    @GetMapping("/hello")
    public String greeting()
    {
        return "Вітаємо на сторінці Hello!";
    }
    @GetMapping("/bye")
    public String goAway()
    {
        return "Вітаємо на сторінці GoAway!";
    }
}
