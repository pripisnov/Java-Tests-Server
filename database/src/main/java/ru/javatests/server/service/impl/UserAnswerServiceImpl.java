package ru.javatests.server.service.impl;

import org.springframework.stereotype.Service;
import ru.javatests.server.models.UserAnswer;
import ru.javatests.server.repos.UserAnswerRepo;
import ru.javatests.server.service.UserAnswerService;

import java.util.List;

@Service
public class UserAnswerServiceImpl implements UserAnswerService {

    private final UserAnswerRepo userAnswerRepo;

    public UserAnswerServiceImpl(UserAnswerRepo userAnswerRepo) {
        this.userAnswerRepo = userAnswerRepo;
    }

    @Override
    public UserAnswer addUserAnswer(UserAnswer userAnswer) {
        return userAnswerRepo.saveAndFlush(userAnswer);
    }

    @Override
    public UserAnswer editUserAnswer(UserAnswer userAnswer) {
        return userAnswerRepo.saveAndFlush(userAnswer);
    }

    @Override
    public void delete(Integer id) {
        this.userAnswerRepo.deleteById(id);
    }

    @Override
    public UserAnswer getById(Integer id) {
        return userAnswerRepo.getOne(id);
    }

    @Override
    public List<UserAnswer> getAll() {
        return userAnswerRepo.findAll();
    }
}
