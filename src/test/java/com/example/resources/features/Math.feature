Feature: Math verification

  Scenario Outline: Verify addition works
    Given I have numbers <a> and <b>
    When I add them
    Then the result should be <sum>

    Examples:
      | a | b | sum |
      | 1 | 2 | 3   |
      | 3 | 4 | 7   |
      | 5 | 5 | 10  |
