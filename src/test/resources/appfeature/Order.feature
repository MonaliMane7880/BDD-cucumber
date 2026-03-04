@order
Feature: Order information
@sanity
Scenario: Fetch currently placed order
Given user is already logged in
When user clicks on current order button
Then current order information should display

@functional @sanity 
Scenario: Fetch cancelled order info
Given user is already logged in
When user clicks on cancelled order button
Then cancelled order information should display

@regression
Scenario: Fetch completed order info
Given user is already logged in
When user click on order history
Then completed order information should display 