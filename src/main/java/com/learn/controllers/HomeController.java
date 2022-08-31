package com.learn.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController
{
    @RequestMapping("/home")
    public String Home()
    {
        return "Home Page";
    }
    @RequestMapping("/login")
    public String Login()
    {
        return "Login";
    }

    @RequestMapping("/logout")
    public String Logout()
    {
        return "Logout";
    }
}
