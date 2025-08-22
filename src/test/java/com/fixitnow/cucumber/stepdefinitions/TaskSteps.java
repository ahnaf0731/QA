package com.fixitnow.steps;

import io.cucumber.java.en.*;

public class TaskSteps {

    @Given("the task title is {string}")
    public void the_task_title_is(String title) {
        // Save the title in a variable
    }

    @Given("the task description is {string}")
    public void the_task_description_is(String description) {
        // Save the description in a variable
    }

    @When("I add the task")
    public void i_add_the_task() {
        // Add the task to your list or repository
    }

    @Then("the task list should contain {int} task")
    public void the_task_list_should_contain_task(Integer count) {
        // Assert the number of tasks
    }

    @Then("the task title should be {string}")
    public void the_task_title_should_be(String title) {
        // Assert the task title
    }
}
