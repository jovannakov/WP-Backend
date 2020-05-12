package com.example.demo.Repository.Jpa;

import com.example.demo.Models.Entities.Role;
import com.example.demo.Repository.RolesRepository;
import com.sun.istack.Nullable;
import org.springframework.stereotype.Repository;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Optional;

@Repository
public class JpaRoles implements RolesRepository {
    private final JpaRepoRole jpaRepoRole;
    public Role role;

    public JpaRoles(JpaRepoRole jpaRepoRole){
        this.jpaRepoRole = jpaRepoRole;
    }


    private void ReturnData(Role r){
        this.role = r;
    }

    @Override
    public Role Find(int id) {
        Optional<Role> s = this.jpaRepoRole.findById(id);
        s.ifPresent(role -> {
            ReturnData(role);
        });
        return this.role != null ? this.role : null;
    }
}
