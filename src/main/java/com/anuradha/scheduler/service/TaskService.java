package com.anuradha.scheduler.service;

import java.util.List;

import com.anuradha.scheduler.entity.Task;

public interface TaskService {

    Task saveTask(Task task);

    List<Task> getAllTasks();

    Task getTaskById(Long id);

    void deleteTask(Long id);

}