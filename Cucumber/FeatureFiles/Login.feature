@simplelogin
Feature: This is the login feature for orange HRM
@Validlogin
Scenario: Valid Login
Given user is on login page
When user enters the valid username & Password
And clicks on the login button
Then the user should be navigated to home page

@InValidlogin
Scenario: invalid Login
Given user is on login page
When user enters the valid username & Password
And clicks on the login button
Then the user should be navigated to home page