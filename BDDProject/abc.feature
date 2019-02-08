Feature: Sign Up Validation

  Scenario Outline: LogIn to Facebook website
    Given i enter facebook
    When i type userId as <user>
    And i type passord as <pass>
    And i click on log in button
    Then i should be logged in successfully

    Examples: 
      | user               | pass      |
      | "ab234c@yahoo.com" | "Abcd123" |
      | "ab2dfvd34c@yahoo.com" | "Abcvfdd123" |
