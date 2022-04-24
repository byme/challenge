@sortLow
Feature: Logout
  In order so see the low products first
  As a customer
  I sort by the low values

  @sortLowSuccess
  Scenario: Success sort low
    Given mitchell navigates to https://www.saucedemo.com/
    And  log into the page
    When  sort for the low prices
    Then the products should be organize by the lowest