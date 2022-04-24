@Logout
Feature: Logout
  In order to enter de product page
  As a customer
  I want logg in

  @LogOutSuccess
  Scenario: Success logout
    Given carlos navigates to https://www.saucedemo.com/
    And he log into the page
    When he logout
    Then the page shoult not be the product page
