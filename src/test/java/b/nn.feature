Feature: Payment Page

  @regression
  Scenario: Successful Payment
    Given the user has itemsk in the cart

  @sanity
  Scenario: Payment with Invalid Card Number
    Given the user has cash

  @smoke
  Scenario: Successful Payment via Credit Card
    Given the user has items in the cart

  @sanity
  Scenario: Successful Payment via PayPal
    Given the user has items in the cart
