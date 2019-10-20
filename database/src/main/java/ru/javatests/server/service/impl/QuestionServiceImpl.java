package ru.javatests.server.service.impl;

import org.springframework.stereotype.Service;
import ru.javatests.server.models.Question;
import ru.javatests.server.repos.QuestionRepo;
import ru.javatests.server.service.QuestionService;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepo questionRepo;

    public QuestionServiceImpl(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public Question addQuestion(Question question) {
        return questionRepo.saveAndFlush(question);
    }

    @Override
    public Question editQuestion(Question question) {
        return questionRepo.saveAndFlush(question);
    }

    @Override
    public void delete(Integer id) {
        this.questionRepo.deleteById(id);
    }

    @Override
    public Question getByName(String name) {
        return questionRepo.getQuestionByName(name);
    }

    @Override
    public Question getById(Integer id) {
        return questionRepo.getOne(id);
    }

    @Override
    public List<Question> getAll() {
        return questionRepo.findAll();
    }
}
