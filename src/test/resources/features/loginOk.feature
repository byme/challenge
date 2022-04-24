@Login
Feature: Login page
  In order to enter de product page
  As a customer
  I want logg in

  @AddingSuccess
  Scenario: Success login
    Given juan navigates to https://www.saucedemo.com/
    When he enter the correct info
    Then should see the product page