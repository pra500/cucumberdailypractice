Feature: Payment Gateway

  Scenario Outline: Payment Declined due to Invalid Credit Card Number
    Given the user has items in the cart "<usereee>"

    Examples: 
      | usereee |
      | pragti  |
      | gupta   |
