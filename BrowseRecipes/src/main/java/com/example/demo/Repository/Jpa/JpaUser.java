package com.example.demo.Repository.Jpa;

import com.example.demo.Models.Entities.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JpaUser implements UserRepository {

    private final JpaRepositoryUser jpaRepositoryUser;

    public JpaUser(JpaRepositoryUser jpaRepositoryUser){
        this.jpaRepositoryUser = jpaRepositoryUser;
    }


    @Override
    public List<User> GetAllUsers() {
        return jpaRepositoryUser.getall();
    }

    @Override
    public void CreateUser(User user) {
        this.jpaRepositoryUser.save(user);
    }
}
