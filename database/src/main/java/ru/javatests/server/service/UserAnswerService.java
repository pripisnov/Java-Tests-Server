package ru.javatests.server.service;

import ru.javatests.server.models.UserAnswer;

import java.util.List;

public interface UserAnswerService {
    UserAnswer addUserAnswer(UserAnswer userAnswer);
    UserAnswer editUserAnswer(UserAnswer userAnswer);
    void delete(Integer id);
    UserAnswer getById(Integer id);
    List<UserAnswer> getAll();
}
