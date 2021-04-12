package org.preproject.springboot.springbootpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String Login(Model model){
        model.addAttribute("login");
        return "login";
    }
}
