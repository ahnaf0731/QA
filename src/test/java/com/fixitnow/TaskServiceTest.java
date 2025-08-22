package com.fixitnow.services;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class TaskServiceTest {

    private TaskService taskService;

    @BeforeEach
    void setup() {
        taskService = new TaskService();
    }

    @Test
    void testAddTask() {
        taskService.addTask("Buy Milk", "Buy 2 liters of milk");
        List<TaskService.Task> tasks = taskService.getTasks();

        assertEquals(1, tasks.size());
        assertEquals("Buy Milk", tasks.get(0).getTitle());
        assertEquals("Buy 2 liters of milk", tasks.get(0).getDescription());
    }
}
