package ru.javatests.server.service.impl;

import org.springframework.stereotype.Service;
import ru.javatests.server.models.User;
import ru.javatests.server.repos.UserRepo;
import ru.javatests.server.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {
        return userRepo.save(user);
    }

    public User editUser(User user) {
        return userRepo.save(user);
    }

    public void delete(Integer id) {
        userRepo.deleteById(id);
    }

    public User getByName(String name) {
        return userRepo.getUserByName(name);
    }

    public User getById(Integer id) {
        return userRepo.getOne(id);
    }

    public List<User> getAll() {
        return userRepo.findAll();
    }
}
