package ru.javatests.server.service;

import ru.javatests.server.models.QuestionType;

import java.util.List;

public interface QuestionTypeService {
    QuestionType addQuestionType(QuestionType questionType);
    QuestionType editQuestionType(QuestionType questionType);
    void delete(Integer id);
    QuestionType getByName(String name);
    QuestionType getById(Integer id);
    List<QuestionType> getAll();
}
