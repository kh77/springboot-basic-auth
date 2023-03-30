package com.sm.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/index")
    public String index() {
        return "Public end point";
    }

    @GetMapping("/user")
    public String getUserRole() {
        return "User Role endpoint";
    }

    @GetMapping("/admin")
    public String adminAndUserEndpoint() {
        return "Admin/User endpoint";
    }

    @GetMapping("/me")
    public String getUserDetails(Authentication authentication) {
        return String.format("User: %s, Role: %s", authentication.getName(), authentication.getAuthorities().toString());
    }
}
