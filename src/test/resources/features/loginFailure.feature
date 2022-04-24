@Login
Feature: Login page Wrong
  In order to enter see the warning message
  As a customer
  I want logg in a bad way

  @LoginFailure
  Scenario: Fail login
    Given ana navigates to https://www.saucedemo.com/
    When he enter the incorrect info
    Then should see info message