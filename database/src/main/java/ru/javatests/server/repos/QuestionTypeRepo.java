package ru.javatests.server.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javatests.server.models.QuestionType;

@Repository
public interface QuestionTypeRepo extends JpaRepository<QuestionType, Integer> {
    QuestionType getQuestionTypeByName(String name);
}
