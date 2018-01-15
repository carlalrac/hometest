Feature: eBay filter results by Category
  As a eBay guest user,
  I want to be able to filter my results by category

Scenario: New user can filter their search by category beforehand
  Given A user is on eBay homepage
     And the user is not registered or login
  When the user selects "Collectables" category filter
    And the user search for "red shoes"
  Then the user can see their search results for "red shoes" in the "Collectables" category

Scenario: New user can filter their result search by category
  Given A user is on eBay homepage
     And the user is not registered or login
  When the user search for "red shoes"
  Then the user can see their search results for "red shoes"
  When the user selects "Collectables" category filter
  Then the user can see their search results for "red shoes" in the "Collectables" category

