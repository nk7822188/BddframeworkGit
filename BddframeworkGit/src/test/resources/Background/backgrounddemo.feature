Feature: This is background demo
Background: User is logged in to Prod site
Given User is on login page
When User enters valid username and password
Then User shuold be able to navigate to Home page

Scenario: Test Menu Items
#Given User will access the login page of Prod site
#When User enters valid credentials
And click on breadcrumb icon
Then User should be able to see the menu items

Scenario: Verify Add to bag functionality
#Given User will access the login page of Prod site
#When User enters valid credentials
And click on Add to bag button on PLP page
Then Item should be added to the cart