package com.fixitnow.model;

public class Task {
    private String title;
    private String description;

    // No-args constructor
    public Task() {}

    // Constructor with fields
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getters & Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
