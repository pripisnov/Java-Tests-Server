package ru.javatests.server.service;

import ru.javatests.server.models.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);
    Category editCategory(Category category);
    void delete(Integer id);
    Category getByName(String name);
    Category getById(Integer id);
    List<Category> getAll();
}
