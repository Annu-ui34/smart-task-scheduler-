package com.anuradha.scheduler.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anuradha.scheduler.entity.Category;
import com.anuradha.scheduler.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Category saveCategory(Category category) {
        return repository.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return repository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }
}