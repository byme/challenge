@CompleteShopping
Feature: Complete shopping process
  In order to to buy some items
  As a customer
  I want complete the shopping process

  @CompleteShoppingSuccess
  Scenario: Success shopping
    Given haru wants to buy items in saucedemo page
    When enter the entire information
    Then should see the success message