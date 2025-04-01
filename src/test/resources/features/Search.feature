Feature: search functionality

  Scenario: user search for valid product
    Given user opens the application
    When user enters valid product "HP" into search box
    And user clicks on search button
    Then user should get valid product displayed in search results

  Scenario: user search for invalid product
    Given user opens the application
    When user enters invalid product "honda" into search box
    And user clicks on search button
    Then user should get a message about no product matching

  Scenario: user searches without any product
    Given user opens the application
    When user don't enters any product name into search box
    And user clicks on search button
    Then user should get a message about no product matching
