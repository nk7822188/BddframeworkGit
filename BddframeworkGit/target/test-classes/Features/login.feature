Feature: Login page Automation

Scenario Outline: Check login is successful with valid credentials
Given User is on login page
When User enters valid "<username>" and "<password>"
And Clicks on Login Button
Then User shuold be navigating to Home page
And Close the browser 

Examples:
| username | password |
| neechin743@gmail.com | Test@1234 |
| neechin743+1@gmail.com | Test@1234 |
| neechin743+1@gmail.com | Test@1234 |