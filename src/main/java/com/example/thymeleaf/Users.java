package com.example.thymeleaf;

import org.springframework.web.server.ResponseStatusException;

public class Users  {
    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }



    private String email;

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
}
