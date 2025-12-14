package com.example.usermanagement.service;


import java.util.List;
import com.example.usermanagement.entity.User;


public interface UserService {
List<User> getAllUsers();
User addUser(User user);
User updateUser(Long id, User user);
void deleteUser(Long id);
}