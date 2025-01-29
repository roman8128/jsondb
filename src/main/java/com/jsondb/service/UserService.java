package com.jsondb.service;

import com.jsondb.domain.User;
import com.jsondb.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public Iterable<User> list(List<User> users) {
        userRepository.saveAll(users);
        return null;
    }
}

