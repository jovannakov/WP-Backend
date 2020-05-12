package com.example.demo.Web.rest;


import com.example.demo.Models.DTO.UserDTO;
import com.example.demo.Models.Entities.User;
import com.example.demo.Services.ServiceInterfaces.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void CreateUser(
            @RequestParam(value = "username") String username,
            @RequestParam(value = "email") String email,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "bio") String bio
    ){
        UserDTO user = new UserDTO(username, email, password, bio);
        this.userService.CreateUser(user);
    }
}
