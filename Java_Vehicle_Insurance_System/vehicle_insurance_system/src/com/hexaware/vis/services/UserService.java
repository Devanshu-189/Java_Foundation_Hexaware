package com.hexaware.vis.services;

import com.hexaware.vis.entities.User;

public interface UserService {

    User registerUser(User user);

    User login(String email, String password);

    User getUserById(Long userId);

    User updateUserProfile(User user);
}
