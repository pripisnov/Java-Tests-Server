package ru.javatests.server.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javatests.server.models.UserTest;

@Repository
public interface UserTestRepo extends JpaRepository<UserTest, Integer> {
}
