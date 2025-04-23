Feature: Login functionality

  Scenario Outline: User logs in with valid credentials
    Given I have the following login types
      | transaction | types         |
      | transfer    | manual, mobile |
      | inward      | manual, mobile |
    When the user enters username "<username>" and password "<password>"
    Then the login should be "<status>"

    Examples:
      | username | password | status  |
      | admin    | admin123 | success |
      | user     | wrongpwd | failure |
