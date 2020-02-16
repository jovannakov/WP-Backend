package com.example.demo.Web.rest;


import com.example.demo.Models.Entities.User;
import com.example.demo.Services.ServiceInterfaces.UserService;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "user", produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
public class UserController {


    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }


    @GetMapping
    public List<User> ListAll(){
        return userService.ListAll();
    }
}
