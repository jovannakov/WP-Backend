package com.example.demo.Services.ServiceImplementations;

import com.example.demo.Models.DTO.UserDTO;
import com.example.demo.Models.Entities.Role;
import com.example.demo.Models.Entities.User;
import com.example.demo.Repository.RolesRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Services.ServiceInterfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;
    private final RolesRepository rolesRepository;

    public UserServiceImplementation(UserRepository userRepository,
                                     RolesRepository rolesRepository){
        this.userRepository = userRepository;
        this.rolesRepository = rolesRepository;
    }

    @Override
    public List<User> ListAll() {
        return userRepository.GetAllUsers();
    }

    @Override
    public void CreateUser(UserDTO u) {
        User user = new User();
        user.setEMail(u.getEmail());
        user.setHashedPassword(u.getPassword());
        user.setBio(u.getBio());
        Role role = this.rolesRepository.Find(2);
        user.setRole(role);
        this.userRepository.CreateUser(user);
    }
}
