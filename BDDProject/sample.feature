Feature: verify title

	Background: 
    Given i open browser
    When i enter facebook url


  Scenario: 
    Given user open browser
      | Firefox |
      | Chrome  |
    And navigate to url
    When user will verify title
    Then title should contains facebook keyword

  Scenario: login to facebook
    And i enter userid as "myuserid"
    And i type password as "mypassword"
    And i click on logIn button
    Then I should be logged in successfully

  Scenario: login to facebook page
    And i enter userid as "myuserid"
    And i type password as "mypassword"
    And i click on logIn button
    Then I should be logged in successfully
