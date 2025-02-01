Feature: User registration

  @signup
  Scenario: validate the user registration
    Given I am on the registration page
    When User fill all the details
      | name  | company | email                   | password  | confirm password |
      | Sidra | Ducat   | sidraaslam786@gmail.com | sidra@123 | sidra@123        |
    And click on the register button
    Then user get the success message

  @login
  Scenario Outline: check the successful login with valid & invalid credentials
    Given user is on the login page
    When fill all the correct <username> and <password>
    And press the login button
    Then user should see the home page

    Examples: 
      | username                | password  |
      | sidraaslam786@gmail.com | sidra@123 |
      | rah123@gmail.com        | dfer345   |
