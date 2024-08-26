Feature: Checkout Page

  Background: Checkout with Invalid Payment Details
    Given the user has items in the cart

  @regression
  Scenario: Successful Checkout
    Given the user has itemsffff in the cart
    When the user navigates to the checkout page

@sanity
   Scenario: Checkout with Missing Shipping Details
    Given the user has items in the cart
    