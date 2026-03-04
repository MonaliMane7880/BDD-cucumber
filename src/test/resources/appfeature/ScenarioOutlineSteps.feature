Feature: Signup functionality
Scenario Outline: Signup to application
Given user is at the signup page
When user enters name as "<name>" on form
And user selects gender as "<gender>" with weight is <weight>
And user selects slotnumber as <slotnumber>
Then user gets created

Examples:
| name | gender | weight | slotnumber|
| Eder| Male| 66.23| 2|
| Ron| Male| 70.0| 1|
| Diana| Female| 75.4| 3|
| Alex| Male| 55.2| 4|
