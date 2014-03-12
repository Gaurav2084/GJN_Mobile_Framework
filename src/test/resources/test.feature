Feature: Android Launch test

  Scenario: Android test scenario
    Given activity should be "MyActivity"
   	Given I go to "Simple Elements"
   	When I press on "Normal Button"
   	When I press "Long press text"
   	Then I should see "long press text was long pressed"
