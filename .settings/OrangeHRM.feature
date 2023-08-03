Feature: Test OrangeHRM Application

  Scenario: Test Login Functionality
    Given user on LoginPage
    When User enter valid username and password
    Then Click on Login botton
