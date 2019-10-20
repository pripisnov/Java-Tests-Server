package ru.javatests.server.service;

import ru.javatests.server.models.QuestionAnswer;

import java.util.List;

public interface QuestionAnswerService {
    QuestionAnswer addQuestionAnswer(QuestionAnswer questionAnswer);
    QuestionAnswer editQuestionAnswer(QuestionAnswer questionAnswer);
    void delete(Integer id);
    QuestionAnswer getByName(String name);
    QuestionAnswer getById(Integer id);
    List<QuestionAnswer> getAll();
}
