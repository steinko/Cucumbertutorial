Feature: Checkout

 Scenario: Two bananas scanned separately 
    Given the price of a "banana" is 40 c 
    When I checkout 1 "banana"
    And I checkout 1 "banana"
    Then the total price should be 80 c
    
 Scenario: A banana and an apple
    Given the price of a "banana" is 40 c 
    And the price of a "apple" is 25 c 
    When I checkout 1 "banana"
    And I checkout 1 "apple"
    Then the total price should be 65 c
    
  Scenario Outline: Checkout a banana
    Given the price of a "banana" is 40 c 
    When I checkout <count> "banana"
    Then the total price should be <total> c

    Examples:
          | count | total |
          | 1     | 40    |
          | 2     | 80    |