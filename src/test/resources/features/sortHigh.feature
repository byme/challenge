@sortHigh
Feature: Logout
  In order so see the highest products first
  As a customer
  I sort by the high values

  @sortHighSuccess
  Scenario: Success sort high
    Given nicolas navigates to https://www.saucedemo.com/
    And  log into the main page
    When  sort for the hightes prices
    Then the products should be organize by the highest