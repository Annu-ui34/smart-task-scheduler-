package com.anuradha.scheduler.service;

import java.util.List;

import com.anuradha.scheduler.entity.Category;

public interface CategoryService {

    Category saveCategory(Category category);

    List<Category> getAllCategories();

    Category getCategoryById(Long id);

    void deleteCategory(Long id);

}