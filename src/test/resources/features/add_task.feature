Feature: Add Task

  As a user
  I want to add a new task
  So that I can track my work

  Scenario: Successfully add a new task
    Given the task title is "Buy Milk"
    And the task description is "From supermarket"
    When I add the task
    Then the task list should contain 1 task
    And the task title should be "Buy Milk"
