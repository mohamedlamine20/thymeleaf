package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @GetMapping("/signUp")
    public String singUp(){
        return "sign-up";
    }

    @PostMapping("/signup-submit")
    public String submitSignUp(@ModelAttribute Users user, Model model){
        model.addAttribute("user",user);
        return "ok";
    }
}
