package com.jdvpl.users.users.service;

import java.util.List;
import java.util.Optional;

import com.jdvpl.users.users.models.entity.User;

public interface UserService {
    List<User> list();

    Optional<User> findById(Long id);

    User save(User user);

    void delete(Long id);
}
