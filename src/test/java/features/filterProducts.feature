Feature: Filter Products Functionality

  Scenario: Filtering products by price from low to high
    Given User is on the products page
    When User filters products by price from low to high
    Then User should see products sorted from low to high price