package com.anuradha.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anuradha.scheduler.entity.Dependency;

public interface DependencyRepository extends JpaRepository<Dependency, Long> {

}