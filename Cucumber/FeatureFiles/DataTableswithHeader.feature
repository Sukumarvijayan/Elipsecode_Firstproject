Feature: This is the login feature for orange HRM
Scenario: This is login sceanrio
Given Go to login page
When Enters the below credentials
| username | Password |
|admin | Suku|
And clicks login button
Then the user in home page