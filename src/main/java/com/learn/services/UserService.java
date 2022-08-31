package com.learn.services;

import com.learn.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService
{
    List<User> list= new ArrayList<>();

    public UserService()
    {
        list.add(new User("abc", "abc", "ABC@GMAIL.COM"));
        list.add(new User("xyz", "xyz", "XYZ@GMAIL.COM"));
    }

    //get all user
    public List<User> getAllUser()
    {
        return  this.list;
    }

    //get single user
    public User getUser(String username)
    {
        return this.list.stream().filter(e -> e.getUserName().equals(username)).findAny().orElse(null);
    }


    public User addUser(User user)
    {
        this.list.add(user);
        return user;
    }
}
