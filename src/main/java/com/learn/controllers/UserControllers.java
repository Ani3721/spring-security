package com.learn.controllers;

import com.learn.models.User;
import com.learn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class UserControllers
{
    @Autowired
    private UserService userService;

//    @RequestMapping("/home")
//    public String home()
//    {
//        return "we are home";
//    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/one")
    public List<User> getAllUser()
    {
        return userService.getAllUser();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username)
    {
        return userService.getUser(username);
    }

    @PostMapping("/add")
    public User add (@RequestBody User user)
    {
        System.out.println("we are post method");

        return this.userService.addUser(user);
    }

}
