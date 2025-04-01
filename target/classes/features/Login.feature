Feature: Login Functionality

Scenario: Login with valid credentials

Given user is navigated to login page
When user enters valid email address "sahu.bikash000@gmail.com" into the email field
And user has entered valid password "Bikash@#92" into password field
And User clicks on login button
Then user should get successfully logged in


Scenario: Login with invalid credentials

Given user is navigated to login page
When user enters invalid email address "jadav.bikash5433@gmail.com" into the email field
And user has entered invalid password "Nishant@#92" into password field
And User clicks on login button
Then user should get proper warning message about credential mismatch


Scenario: Login with valid email and invalid password

Given user is navigated to login page
When user enters valid email address "sahu.bikash000@gmail.com" into the email field
And user has entered invalid password "Nishant@#92" into password field
And User clicks on login button
Then user should get proper warning message about credential mismatch



Scenario: Login with invalid email and valid password

Given user is navigated to login page
When user enters valid email address "patil.bikash000@gmail.com" into the email field
And user has entered invalid password "Bikash@#92" into password field
And User clicks on login button
Then user should get proper warning message about credential mismatch

Scenario: Login without providing any credential

Given user is navigated to login page
When user doesn't enter email address into the email field
And user doesn't enter password into the password field
And User clicks on login button
Then user should get proper warning message about credential mismatch