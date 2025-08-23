package com.fixitnow.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login"; // renders templates/login.html
    }

    @PostMapping("/login")
    public String doLogin(@RequestParam String username,
                          @RequestParam String password,
                          HttpSession session) {
        // very simple demo auth
        if ("admin".equals(username) && "admin123".equals(password)) {
            session.setAttribute("AUTH", true);
            return "redirect:/tasks";
        }
        return "redirect:/login?error=1";
    }

    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
