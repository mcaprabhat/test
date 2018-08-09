Feature: ATA calc test

  Background: 
    Given user open "http://localhost:4200/#/login" in browser

  Scenario Outline: Regression Test
    And user enter <name> and <password>
    
    And click on submit
    Then result should <result>

    Examples: 
      | name    | password     |
      |   demo  | demo         |