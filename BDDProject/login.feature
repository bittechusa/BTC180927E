Feature: Login validation

Scenario: login to facebook
Given i open browser
When i enter facebook url
And i enter userid as "myuserid"
And i type password as "mypassword"
And i click on logIn button
Then I should be logged in successfully


