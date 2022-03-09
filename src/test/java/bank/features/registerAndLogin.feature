Feature: Register and Login

  @register_login
  Scenario: Register to system and login
    Given Get login page url
    When Open Register page
    And Input to email textbox
    And Click to Submit
    And Get User and password infor
    And Back to Login page
    And Submit valid infor to login form
    Then Home page displayed