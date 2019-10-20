package ru.javatests.server.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javatests.server.models.UserAnswer;

@Repository
public interface UserAnswerRepo extends JpaRepository<UserAnswer, Integer> {
}
