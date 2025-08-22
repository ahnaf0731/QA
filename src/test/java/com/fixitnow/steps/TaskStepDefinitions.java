package com.fixitnow.steps;

import com.fixitnow.model.Task;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

public class TaskStepDefinitions {

    private Task task;

    @Given("a new task is created")
    public void a_new_task_is_created() {
        // Use null for id if it will be generated automatically
        task = new Task(null, "Test Task", "This is a test task description");
    }

    @When("the task title is updated to {string}")
    public void the_task_title_is_updated_to(String newTitle) {
        task.setTitle(newTitle);
    }

    @Then("the task should have title {string}")
    public void the_task_should_have_title(String expectedTitle) {
        assertEquals(expectedTitle, task.getTitle());
    }

    @When("the task description is updated to {string}")
    public void the_task_description_is_updated_to(String newDescription) {
        task.setDescription(newDescription);
    }

    @Then("the task should have description {string}")
    public void the_task_should_have_description(String expectedDescription) {
        assertEquals(expectedDescription, task.getDescription());
    }
}
