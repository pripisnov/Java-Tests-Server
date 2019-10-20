package ru.javatests.server.service;

import ru.javatests.server.models.UserTestStatus;

import java.util.List;

public interface UserTestStatusService {
    UserTestStatus addUserTestStatus(UserTestStatus userTestStatus);
    UserTestStatus editUserTestStatus(UserTestStatus userTestStatus);
    void delete(Integer id);
    UserTestStatus getByName(String name);
    UserTestStatus getById(Integer id);
    List<UserTestStatus> getAll();
}
