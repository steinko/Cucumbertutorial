Feature: Feedback when entering invalid credit card details

  In user testing we've seen a lot of people who made mistakes
  entering their credit card. We need to be as helpful as possible
  here to avoid losing users at this crucial stage of the
  transaction.

  Background:
    Given I have chosen some items to buy
    And I am about to enter my credit card details

  Scenario: Credit card number too short
    Given  I enter a card number 416985000106406
    And Valid To 02/23
    And CVC 074
    When I submit the form
    Then the form should be redisplayed
    And I should see a message  "Please enter a 16 digits credit car number"  
    
  Scenario: Expiry date must not be in the past
    Given  I enter a card number 4169850001064067
    And Valid To 02/19
    And CVC 074
    When I submit the form
    Then the form should be redisplayed
    And I should see a message  "Credit Card Expired"