Feature: eBay filter results
  As a eBay guest user,
  I want to be able to filter my results by All listings | Auction | Buy Now




  Scenario: New user can filter their results by Auction
    Given A user is on eBay homepage
    And the user is not registered or login
    When the user search for "The Room"
    Then the user can see their search results for "The Room"
    And the result is filter by "All listings"
    When the user filter their results by "Auction"
    Then the result is filter by "Auction"
    And the user can see the number of bids on the "1" item
    And the given price of item "1"
    And the postage fee or the free postage tag of item "4"

  Scenario: New user can filter their results by Buy it now
    Given A user is on eBay homepage
    And the user is not registered or login
    When the user search for "The Room"
    Then the user can see their search results for "The Room"
    And the result is filter by "All listings"
    When the user filter their results by "Buy it now"
    Then the result is filter by "Buy it now"
    Then the user can see Buy now, or Buy now and see offers tags on the "3" item

  Scenario: New user can filter their results by Buy it now
    Given A user is on eBay homepage
    And the user is not registered or login
    When the user search for "The Room"
    Then the user can see their search results for "The Room"
    And the result is filter by "All listings"
    When the user filter their results by "Buy it now"
    Then the result is filter by "Buy it now"
    And the user can see Buy now, or Buy now and see offers tags on the "2" item