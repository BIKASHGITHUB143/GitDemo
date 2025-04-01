Feature: Registration functionality

  Scenario: User creates an account only with mandatory fields
    Given User navigates to register Account page
    When user enters the details into below fields
      | FirstName |  | Santosh                  |
      | LastName  |  | Sahu                     |
      | Email     |  | bikashsahu1515@gmail.com |
      | Telephone |  |               7506360390 |
      | Password  |  |                    12345 |
    And user selects the privacy policy
    And user clicks on continue button
    Then user account should get created successfully

  Scenario: User creates an account with all fields
    Given User navigates to register Account page
    When user enters the details into below fields
      | FirstName |  | Rakesh                   |
      | LastName  |  | Sahu                     |
      | Email     |  | bikashsahu1616@gmail.com |
      | Telephone |  |               7506360360 |
      | Password  |  |                    12345 |
    And user selects yes for Newsletter
    And user selects the privacy policy
    And user clicks on continue button
    Then user account should get created successfully

  Scenario: User creates an account with all fields
    Given User creates a duplicate account
    When user enters the details into below fields
      | FirstName |  | Santosh                  |
      | LastName  |  | Sahu                     |
      | Email     |  | bikashsahu1515@gmail.com |
      | Telephone |  |               7506360390 |
      | Password  |  |                    12345 |
    And user selects yes for Newsletter
    And user selects the privacy policy
    And user clicks on continue button
    Then user should get a proper warning about duplicate email

  Scenario: User creates an account without filling all details
    Given User creates a duplicate account without filling any details
    When user don't enters the details into fields
    And user clicks on continue button
    Then user should get a proper warning messages for every mandatory fields
