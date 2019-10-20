package ru.javatests.server.service.impl;

import org.springframework.stereotype.Service;
import ru.javatests.server.models.QuestionAnswer;
import ru.javatests.server.repos.QuestionAnswerRepo;
import ru.javatests.server.service.QuestionAnswerService;

import java.util.List;

@Service
public class QuestionAnswerServiceImpl implements QuestionAnswerService {

    private final QuestionAnswerRepo questionAnswerRepo;

    public QuestionAnswerServiceImpl(QuestionAnswerRepo questionAnswerRepo) {
        this.questionAnswerRepo = questionAnswerRepo;
    }

    @Override
    public QuestionAnswer addQuestionAnswer(QuestionAnswer questionAnswer) {
        return questionAnswerRepo.saveAndFlush(questionAnswer);
    }

    @Override
    public QuestionAnswer editQuestionAnswer(QuestionAnswer questionAnswer) {
        return questionAnswerRepo.saveAndFlush(questionAnswer);
    }

    @Override
    public void delete(Integer id) {
        this.questionAnswerRepo.deleteById(id);
    }

    @Override
    public QuestionAnswer getByName(String name) {
        return questionAnswerRepo.getQuestionAnswerByName(name);
    }

    @Override
    public QuestionAnswer getById(Integer id) {
        return questionAnswerRepo.getOne(id);
    }

    @Override
    public List<QuestionAnswer> getAll() {
        return questionAnswerRepo.findAll();
    }
}
