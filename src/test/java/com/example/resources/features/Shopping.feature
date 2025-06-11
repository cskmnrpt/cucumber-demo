Feature: Shopping cart

  Scenario: Adding items to the cart
    Given I have an empty cart
    When I add the following items:
      | item      | quantity |
      | Apple     | 2        |
      | Banana    | 3        |
      | Orange    | 1        |
    Then the cart should contain 3 items

