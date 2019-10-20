package ru.javatests.server.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javatests.server.models.QuestionAnswer;

@Repository
public interface QuestionAnswerRepo extends JpaRepository<QuestionAnswer, Integer> {
    QuestionAnswer getQuestionAnswerByName(String name);
}
