#Author: klganapathi1997@gmail.com

#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>


@tag
Feature: Shopping Cart

  @tag1
  Scenario: Automate the process of adding products o cart
    Given open the Browser
    Given Open the application
    And Login to the Application
    Then Add Products to cart
    And Go to cart
    And Remove some products
    Then checkout
    And Add shipping Details
    And Finish Shopping


