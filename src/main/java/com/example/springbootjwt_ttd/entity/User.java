package com.example.springbootjwt_ttd.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User extends BaseEntity{
    private String username;
    private String password;

    @OneToMany(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",joinColumns = {@JoinColumn(name = "user_id")},
        inverseJoinColumns = {@JoinColumn(name = "tole_id")})
    private Set<Role> roles = new HashSet<>();
}
