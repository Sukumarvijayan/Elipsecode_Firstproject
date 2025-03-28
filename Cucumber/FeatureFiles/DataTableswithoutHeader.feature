Feature: This is the login feature for orange HRM
Scenario: This is login sceanrio
Given You are on the login page
When user enters the below credentials
|Admin|suku|
And clicks the login button
Then the user should see the home page