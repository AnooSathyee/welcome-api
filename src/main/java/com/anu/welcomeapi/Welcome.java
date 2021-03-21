package com.anu.welcomeapi;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping(value="/wish")
    public String getWish() {
        return "Welcome to Rest-API";
    }

    @GetMapping(value="/wishDetails")
    public String getWish(@RequestParam ("uname") String userName) {
        return "Welcome to Rest-API" + userName;
    }

    @GetMapping(value="/date")
    public Date getDate() {
        return  new Date();
    }

}

