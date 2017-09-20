package com.jdriven.ng2boot.service;

import com.jdriven.ng2boot.domain.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    User getUserById(int userId);
    boolean createUser(String login, String email, String password);
    String getUserByLogin(String login, String password);
    void updateUser(User user);
    void deleteUser(int userId);
}