Feature: Valid Age Input

  Scenario: TC_001_Input age within 18 - 80
    Given I am on the calorie calculator website
    When I input my age as 25
    And I click the Calculate button
    Then The calculator should accept the age within the valid range

  Scenario: TC_002_Invalid Age Input - Entering an age less than 18
    Given I am on the calorie calculator website
    When I input my age as 16
    And I click the Calculate button
    Then An error message for invalid age range should be displayed

