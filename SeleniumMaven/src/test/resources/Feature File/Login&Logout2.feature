Feature: login & logout feature demo

  Background: 
    Given User is at login page
    When enter the valid login credentials
    And click on login button
    Then login should successful

  @Login
  Scenario: To validate the login with valid data
    And verify the login successful

  @logout
  Scenario: to verify the Logout
    Given user is present on the homepage
    When click on the profile
    And click on the logout button
    Then logout should successful
