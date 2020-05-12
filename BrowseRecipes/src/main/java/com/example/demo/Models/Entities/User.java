package com.example.demo.Models.Entities;

import lombok.*;
import org.hibernate.annotations.Where;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.persistence.*;
import javax.validation.constraints.Email;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Where(clause = "deleted=false")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private int Id;

    private String eMail;

    private String hashedPassword;

    @Column(columnDefinition = "boolean default false")
    private boolean passwordConfirmed;

    @ManyToOne
    private Role role;

    private String bio;

    @Column(columnDefinition = "boolean default false")
    private boolean deleted;

    @PostConstruct
    public void init(){
        this.bio = "";
    }

}
