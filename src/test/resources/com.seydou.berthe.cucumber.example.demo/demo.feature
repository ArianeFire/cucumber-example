Feature: Team scoring
  Teams start with zero score.
  Correct answer gets points depending on how difficult it is.

  Scenario Outline: New teams should not have scored yet
    Given I register a team
    Then My score is <score>
    Examples:
      | score |
      | 0     |
      | 0     |

  Scenario: Maps
    Given the leader board look like:
      | Pirates | 20 |
      | Sailors | 35 |