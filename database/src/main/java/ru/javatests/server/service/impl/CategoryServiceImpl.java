package ru.javatests.server.service.impl;

import org.springframework.stereotype.Service;
import ru.javatests.server.models.Category;
import ru.javatests.server.repos.CategoryRepo;
import ru.javatests.server.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;

    public CategoryServiceImpl(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepo.saveAndFlush(category);
    }

    @Override
    public Category editCategory(Category category) {
        return categoryRepo.saveAndFlush(category);
    }

    @Override
    public void delete(Integer id) {
        this.categoryRepo.deleteById(id);
    }

    @Override
    public Category getByName(String name) {
        return categoryRepo.getCategoryByName(name);
    }

    @Override
    public Category getById(Integer id) {
        return categoryRepo.getOne(id);
    }

    @Override
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }
}
