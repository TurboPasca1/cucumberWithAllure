Feature: Google Search
  In order to test Google Search Page cheese searching capability
  As a user
  I want to verify the search functionality


  Scenario: Finding some apple
    Given the user on the Google search page
    When the user searches for "Apple!"
    Then the page title starts with "Apple"


  Scenario: Finding some cheese
    Given the user on the Google search page
    When the user searches for "Cheese!"
    Then the page title starts with "Cheese"

    
