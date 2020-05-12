package com.example.demo.Repository;

import com.example.demo.Models.Entities.Role;

import java.util.Optional;

public interface RolesRepository {
    public Role Find(int id);
}
