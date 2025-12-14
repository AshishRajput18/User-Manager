package com.example.usermanagement.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.usermanagement.entity.User;
import com.example.usermanagement.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {


@Autowired
private UserRepository userRepository;


@Override
public List<User> getAllUsers() {
return userRepository.findAll();
}


@Override
public User addUser(User user) {
return userRepository.save(user);
}


@Override
public User updateUser(Long id, User user) {
User existing = userRepository.findById(id)
.orElseThrow(() -> new RuntimeException("User not found"));


existing.setName(user.getName());
existing.setEmail(user.getEmail());
existing.setAge(user.getAge());


return userRepository.save(existing);
}


@Override
public void deleteUser(Long id) {
userRepository.deleteById(id);
}
}