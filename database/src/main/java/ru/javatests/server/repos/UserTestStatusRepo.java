package ru.javatests.server.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javatests.server.models.UserTestStatus;

@Repository
public interface UserTestStatusRepo extends JpaRepository<UserTestStatus, Integer> {
    UserTestStatus getUserTestStatusByName(String name);
}
