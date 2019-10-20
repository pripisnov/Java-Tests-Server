package ru.javatests.server.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javatests.server.models.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
    Question getQuestionByName(String name);
}
