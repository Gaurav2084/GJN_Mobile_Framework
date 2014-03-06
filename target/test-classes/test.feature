Feature: Android Launch test

  Scenario: Android test scenario
    Given activity should be "MyActivity"
   	Given I go to "Simple Elements"
   	When I press "Normal Button"
   	Then I should see "normal button was clicked"
