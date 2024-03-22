package com.logintemplate.logintemplate.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggedController {

    @GetMapping("/")
    public String loggedInMessage(Authentication authentication){
        return "Hellou " + authentication.getName() + " you're logged in!";
    }
}
