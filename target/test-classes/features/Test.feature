@Demo
Feature: Verification of OI Shopping List for android App

  @Smoke
  Scenario: Creation of two new lists in OI Shopping List app
    Given open the shopping list app in mobile device
    Then click on hamburger icon
    And Enter name of new shopping list
    Then click on OK button
    And Add new item to shopping List
    Then Delete item from the list

 	@Regression
 	Scenario: Creation of lists & sort the list and validate the sorting of the list items
    Then create new shopping list and sort the list items
    And sort the items in the shopping list