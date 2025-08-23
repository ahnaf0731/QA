package com.fixitnow.controller;

import com.fixitnow.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/tasks/ui")
public class TaskUiController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/add")
    public String addTask(HttpSession session, String title, String description) {
        taskService.addTask(title, description);
        session.setAttribute("successMessage", "Task added successfully");
        return "redirect:/tasks/add";
    }
}
