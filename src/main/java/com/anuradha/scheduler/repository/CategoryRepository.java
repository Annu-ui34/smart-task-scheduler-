package com.anuradha.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anuradha.scheduler.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}