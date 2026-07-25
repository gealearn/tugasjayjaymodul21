@login
Feature:
  @valid-login
  Scenario: Login using valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage

  @invalid-login-with-wrong-password
  Scenario: Login using invalid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauces"
    When user click login button
    Then user see error message "Epic sadface: Username and password do not match any user in this service"
    
  @invalid-login-with-no-password
  Scenario: Login using no password
    Given user is on login page
    And user input username with "locked_out_user"
    When user click login button
    Then user see error message "Epic sadface: Password is required"


  @invalid-login-with-no-username
  Scenario: Login using no password
    Given user is on login page
    And user input password with "secret_sauce"
    When user click login button
    Then user see error message "Epic sadface: Username is required"
