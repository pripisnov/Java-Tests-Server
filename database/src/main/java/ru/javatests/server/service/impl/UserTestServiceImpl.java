package ru.javatests.server.service.impl;

import ru.javatests.server.models.UserTest;
import ru.javatests.server.repos.UserTestRepo;
import ru.javatests.server.service.UserTestService;

import java.util.List;

public class UserTestServiceImpl implements UserTestService {

    private final UserTestRepo userTestRepo;

    public UserTestServiceImpl(UserTestRepo userTestRepo) {
        this.userTestRepo = userTestRepo;
    }

    @Override
    public UserTest addUserTest(UserTest userTest) {
        return userTestRepo.saveAndFlush(userTest);
    }

    @Override
    public UserTest editUserTest(UserTest userTest) {
        return userTestRepo.saveAndFlush(userTest);
    }

    @Override
    public void delete(Integer id) {
        this.userTestRepo.deleteById(id);
    }

    @Override
    public UserTest getById(Integer id) {
        return userTestRepo.getOne(id);
    }

    @Override
    public List<UserTest> getAll() {
        return userTestRepo.findAll();
    }
}
