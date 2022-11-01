package com.Artinc.Mutfak.service;

import com.Artinc.Mutfak.model.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String username);

    User saveUser(User user);

    void makeAdmin(String username);
}
