package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(
            @RequestParam(name = "name",required = true,defaultValue = "world")String name, Model model
    ){
        model.addAttribute("name",name);
        return "hello";


    }
}
