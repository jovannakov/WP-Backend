package com.example.demo.Repository;

import com.example.demo.Models.Entities.User;
import java.util.List;

public interface UserRepository {

    public List<User> GetAllUsers();

    void CreateUser(User user);
}
