package com.learn.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User
{
    @Id
    String userName;
    String password;
    String email;
    String role;

    public String getRole() {
        return role;
    }

    public User(String userName, String password, String email, String role)
    {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public User()
    {
    }

    @Override
    public String toString()
    {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
