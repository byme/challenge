@OneProduct
Feature: Logout
  In order to add one specific item to the cart
  As a customer
  I want to add one item

  @OneProductSuccess
  Scenario: Success add one product
    Given nanami navigates to https://www.saucedemo.com/
    And  log into the products page
    When  add one specific item
    Then the specific product should be added into the cart