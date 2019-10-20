package ru.javatests.server.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javatests.server.models.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
    Category getCategoryByName(String name);
}
