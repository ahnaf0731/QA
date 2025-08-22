package com.fixitnow.services;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public static class Task {
        private String title;
        private String description;

        public Task(String title, String description) {
            this.title = title;
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }
    }
}
