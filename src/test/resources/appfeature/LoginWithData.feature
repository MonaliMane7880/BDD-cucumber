Feature: Login with data inside the file
Scenario: Login with entering crediantials
Given user is at login page
When user enters username as "testusername"
And user enters password as "Test@1234"
And user clicks on login button
Then user should be logged in


Scenario: Login with entering crediantials
Given user is at login page
When user enters username as "testusername"
And user enters password as "Test@1234"
And user clicks on login 1 button with size 2.3
Then user should be logged in
