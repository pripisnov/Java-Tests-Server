package ru.javatests.server.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javatests.server.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    User getUserByName(String name);
}
