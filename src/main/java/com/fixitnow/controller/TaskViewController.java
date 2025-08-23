package com.fixitnow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskViewController {

    @GetMapping("/tasks/add")
    public String showAddTaskForm() {
        return "addTask"; // looks for addTask.html
    }
}
