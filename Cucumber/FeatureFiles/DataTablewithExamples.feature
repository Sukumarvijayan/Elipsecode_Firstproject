Feature: This is the login feature for orange HRM
Scenario Outline: This is login sceanrio
Given Proceed to login page
When user enters "<username>" and password "<Password>"
And clicks login buttonss
Then User in home page

Examples:
|username | Password |
|admin | Suku|
|admin12 | Suku12|