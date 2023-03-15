package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.util.List;

public interface Users {
    boolean validateUsernamePassword(String username, String password);
    User findByUsername(String username);
    Long insert(User user);
}
