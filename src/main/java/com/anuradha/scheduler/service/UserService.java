package com.anuradha.scheduler.service;

import java.util.List;

import com.anuradha.scheduler.entity.User;

public interface UserService {

    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);

}