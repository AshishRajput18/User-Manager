package com.example.usermanagement.controller;


import java.util.List;


import jakarta.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.usermanagement.entity.User;
import com.example.usermanagement.service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {


@Autowired
private UserService userService;


// 1. List all users
@GetMapping
public List<User> getAllUsers() {
return userService.getAllUsers();
}


// 2. Add new user
@PostMapping
public User addUser(@Valid @RequestBody User user) {
return userService.addUser(user);
}


// 3. Edit user
@PutMapping("/{id}")
public User updateUser(@PathVariable Long id,
@Valid @RequestBody User user) {
return userService.updateUser(id, user);
}


// 4. Delete user
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteUser(@PathVariable Long id) {
userService.deleteUser(id);
return ResponseEntity.ok("User deleted successfully");
}
}