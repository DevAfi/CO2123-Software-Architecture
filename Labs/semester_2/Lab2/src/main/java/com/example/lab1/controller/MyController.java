package com.example.lab1.controller;

import com.example.lab1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
    @PostMapping("/register")
    public String registerUser(@RequestParam String username, String password) {
        userService.registerUser(username, password);

        return "redirect:/login";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/user")
    public String userPage() {
        return "user";
    }
    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }

    @GetMapping("/success-login")
    public String successLogin(Authentication auth) {
        boolean isAdmin = auth.getAuthorities().stream()
                .anyMatch(a->a.getAuthority().equals("ROLE_ADMIN"));
        return isAdmin ? "redirect:/admin" : "redirect:/user";
    }
    @GetMapping("/denied")
    public String denied() {
        return "denied";
    }
}
