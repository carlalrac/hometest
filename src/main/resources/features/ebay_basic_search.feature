Feature: eBay Basic search
  As a eBay guest user,
  I want to be able to search for any items
  
Scenario: New user can perform a basic search
  Given A user is on eBay homepage
    And the user is not registered or login
  When the user search for "iphone 5"
  Then the user can see their search results for "iphone 5"


