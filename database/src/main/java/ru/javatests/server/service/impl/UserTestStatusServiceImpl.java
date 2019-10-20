package ru.javatests.server.service.impl;

import org.springframework.stereotype.Service;
import ru.javatests.server.models.UserTestStatus;
import ru.javatests.server.repos.UserTestStatusRepo;
import ru.javatests.server.service.UserTestStatusService;

import java.util.List;

@Service
public class UserTestStatusServiceImpl implements UserTestStatusService {

    private final UserTestStatusRepo userTestStatusRepo;

    public UserTestStatusServiceImpl(UserTestStatusRepo userTestStatusRepo) {
        this.userTestStatusRepo = userTestStatusRepo;
    }

    @Override
    public UserTestStatus addUserTestStatus(UserTestStatus userTestStatus) {
        return userTestStatusRepo.saveAndFlush(userTestStatus);
    }

    @Override
    public UserTestStatus editUserTestStatus(UserTestStatus userTestStatus) {
        return userTestStatusRepo.saveAndFlush(userTestStatus);
    }

    @Override
    public void delete(Integer id) {
        this.userTestStatusRepo.deleteById(id);
    }

    @Override
    public UserTestStatus getByName(String name) {
        return userTestStatusRepo.getUserTestStatusByName(name);
    }

    @Override
    public UserTestStatus getById(Integer id) {
        return userTestStatusRepo.getOne(id);
    }

    @Override
    public List<UserTestStatus> getAll() {
        return userTestStatusRepo.findAll();
    }
}
