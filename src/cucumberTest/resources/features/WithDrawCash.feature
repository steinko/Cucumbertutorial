Feature: Cash withdrawal
  Scenario: Successful withdrawal from an account in credit
    Given I have $(100) in my account
    When I request $(20)
    Then $(20) should be dispensed
    
   Scenario: Attempt withdrawl using stolen card
     Given I have $(100) in my account
     But my card is invalid
     When I request $(50)
     Then my card should not be returned
     And I should be told  that "Credit Card Close. Contanct The Bank"
     
   Scenario Outline: Withdraw fixed amount
      Given I have <Balance> in my account
      When I choose to witdraw the fixed amount of <Withdrawal>
      Then I should recive <Received> cash
      And the balance of my accout should be <Remaining> 
      
        Examples:
      
      | Balance | Withdrawal | Received | Remaining | 
      | $(500)  | $(50)      | $(50)    | $(450)    | 
      | $(500)  | $(100)     | $(100)   | $(400)    | 
      | $(500)  | $(200)     | $(200)   | $(300)    |