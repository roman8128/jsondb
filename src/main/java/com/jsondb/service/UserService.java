package com.jsondb.service;

import com.jsondb.domain.User;
import com.jsondb.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    @Transactional
    public Iterable<User> save(List<User> users) {
        return userRepository.saveAll(users);
    }
}

