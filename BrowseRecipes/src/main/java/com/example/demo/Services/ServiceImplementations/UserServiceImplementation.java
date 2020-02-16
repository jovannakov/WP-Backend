package com.example.demo.Services.ServiceImplementations;

import com.example.demo.Models.Entities.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.ServiceInterfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> ListAll() {
        return userRepository.GetAllUsers();
    }
}
