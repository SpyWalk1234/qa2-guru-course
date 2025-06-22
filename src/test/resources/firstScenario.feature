Feature: User data modification
  Scenario: First name modification
    Given user first name: Nikita
    And user last name: "Tester"
    And user e-mail: "test@test.lv"

    When we are changing first name to Alex

    Then first name is: ALEX
    And last name is not changed