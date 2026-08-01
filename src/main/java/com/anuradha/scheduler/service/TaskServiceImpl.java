package com.anuradha.scheduler.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anuradha.scheduler.entity.Task;
import com.anuradha.scheduler.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository repository;

    public TaskServiceImpl(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public Task saveTask(Task task) {
        return repository.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}