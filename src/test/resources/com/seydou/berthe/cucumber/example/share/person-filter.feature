Feature: Filter Person
  Person Filter Service is giving a list of persons,
  based on given criteria, it should filter the list of person

  Scenario Outline: Filter By Name
    Given List of person :
      | name      | age | sexe |
      | Adja      | 10  | F    |
      | Seydou    | 23  | M    |
      | Amine     | 23  | M    |
      | Guillaume | 50  | M    |
      | Tata      | 23  | F    |

    And following criteria :
      | name   | age   | sexe   |
      | <name> | <age> | <sexe> |

    When I filter the list
    Then The number of returned person must be : <size>
    Examples:
      | name | age | sexe | size |
      |      |     |      | 5    |
      | e    | 0   |      | 3    |
      |      |     | F    | 2    |
      |      | 40  |      | 1    |

