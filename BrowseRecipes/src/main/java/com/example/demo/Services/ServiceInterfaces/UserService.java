package com.example.demo.Services.ServiceInterfaces;

import com.example.demo.Models.DTO.UserDTO;
import com.example.demo.Models.Entities.User;

import java.util.List;

public interface UserService {



    List<User> ListAll();

    void CreateUser(UserDTO user);
}
