package ru.javatests.server.service;

import ru.javatests.server.models.Question;

import java.util.List;

public interface QuestionService {
    Question addQuestion(Question question);
    Question editQuestion(Question question);
    void delete(Integer id);
    Question getByName(String name);
    Question getById(Integer id);
    List<Question> getAll();
}
