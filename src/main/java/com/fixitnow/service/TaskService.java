package com.fixitnow.service;

import com.fixitnow.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public Task addTask(String title, String description) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Task title cannot be empty");
        }
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Task description cannot be empty");
        }

        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);

        tasks.add(task);
        return task;
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}
