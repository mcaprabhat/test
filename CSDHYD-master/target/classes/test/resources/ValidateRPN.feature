Feature: RPN calc

  Scenario Outline: User Testing
    Given user enter <Input>
    Then sytem display <Output>

    Examples: 
      | Input       | Output |
      | "1,2,3,+,-" | "-4"   |
      | "6,2,*,3,/" | "4"    |
