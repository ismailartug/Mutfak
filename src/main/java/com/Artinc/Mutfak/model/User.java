package com.Artinc.Mutfak.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username",nullable = false,length = 100)
    private String username;

    @Column(name="email",nullable = false,length = 100)
    private String email;

    @Column(name="password",nullable = false,length = 100)
    private String password;

    @Column(name="createTime",nullable = false)
    private LocalDateTime createTime;

    @Enumerated
    @Column(name="role",nullable = false)
    private Role Role;

    @Transient
    private String token;

}
