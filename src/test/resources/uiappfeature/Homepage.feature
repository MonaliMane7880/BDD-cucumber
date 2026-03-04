@homepage
Feature: Homepage functionality
Background:
Given user is at the landing page
@title
Scenario: verify title of page
Then page title should contains "India"

@carticon
Scenario: verify cart icon is displaying
Then cart icon should get displayed

@deals
Scenario: checkout the deal section
When user clicks on soundbar deal
Then user should redirect to deal page