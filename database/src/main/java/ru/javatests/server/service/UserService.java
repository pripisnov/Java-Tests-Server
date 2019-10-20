package ru.javatests.server.service;

import ru.javatests.server.models.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User editUser(User user);
    void delete(Integer id);
    User getByName(String name);
    User getById(Integer id);
    List<User> getAll();
}
