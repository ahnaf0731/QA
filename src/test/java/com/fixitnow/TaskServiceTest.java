package com.fixitnow;

import com.fixitnow.model.Task;
import com.fixitnow.service.TaskService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    private final TaskService taskService = new TaskService();

    @Test
    void shouldNotAllowEmptyTitle() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskService.addTask("", "Some description");
        });
    }

    @Test
    void shouldNotAllowEmptyDescription() {
        assertThrows(IllegalArgumentException.class, () -> {
            taskService.addTask("Some title", "");
        });
    }

    @Test
    void shouldCreateTaskSuccessfully() {
        Task task = taskService.addTask("Valid title", "Valid description");

        assertNotNull(task);
        assertEquals("Valid title", task.getTitle());
        assertEquals("Valid description", task.getDescription());
    }
}
