package ru.javatests.server.service.impl;

import org.springframework.stereotype.Service;
import ru.javatests.server.models.QuestionType;
import ru.javatests.server.repos.QuestionTypeRepo;
import ru.javatests.server.service.QuestionTypeService;

import java.util.List;

@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {

    private final QuestionTypeRepo questionTypeRepo;

    public QuestionTypeServiceImpl(QuestionTypeRepo questionTypeRepo) {
        this.questionTypeRepo = questionTypeRepo;
    }

    @Override
    public QuestionType addQuestionType(QuestionType questionType) {
        return questionTypeRepo.saveAndFlush(questionType);
    }

    @Override
    public QuestionType editQuestionType(QuestionType questionType) {
        return questionTypeRepo.saveAndFlush(questionType);
    }

    @Override
    public void delete(Integer id) {
        this.questionTypeRepo.deleteById(id);
    }

    @Override
    public QuestionType getByName(String name) {
        return questionTypeRepo.getQuestionTypeByName(name);
    }

    @Override
    public QuestionType getById(Integer id) {
        return questionTypeRepo.getOne(id);
    }

    @Override
    public List<QuestionType> getAll() {
        return questionTypeRepo.findAll();
    }
}
