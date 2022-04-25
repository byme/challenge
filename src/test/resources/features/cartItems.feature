@cartItems
Feature: Logout
  In order to add several items to de cart
  As a customer
  I want to add some items

  @scartItemsSuccess
  Scenario: Success sort high
    Given ramiro navigates to https://www.saucedemo.com/
    And  log into the shopping page
    When  add several items
    Then the products should be added into the cart