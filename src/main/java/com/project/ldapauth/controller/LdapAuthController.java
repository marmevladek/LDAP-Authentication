package com.project.ldapauth.controller;

import com.project.ldapauth.model.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LdapAuthController {

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }
}
