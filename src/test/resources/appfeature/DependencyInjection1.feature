Feature: Placing order validation
Scenario: order confirmation post to product addition
Given I should be at the product page
When I click on add to cart button
Then Product should get added to cart
