package ru.javatests.server.service;

import ru.javatests.server.models.UserTest;

import java.util.List;

public interface UserTestService {
    UserTest addUserTest(UserTest userTest);
    UserTest editUserTest(UserTest userTest);
    void delete(Integer id);
    UserTest getById(Integer id);
    List<UserTest> getAll();
}
