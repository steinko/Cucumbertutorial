Feature: Change PIN
Customers beeing issued new cards are supplied with a Personal Identification Number (PIN) that is randomly generated by the system.
In order to be able to change it to something they can easily remember, customer with new credit card need to be able to  change their PIN using the ATM.
Scenario: Change PIN successfully
   Given I have been issued a new card
   And   I insert the card, entring the correct PIN (1234)
   When  I choose "Change PIN" from the menu
   And   I change the PIN to (9876)
   Then  the system should remember my PIN is now (9876)
   
 Scenario: Try to change PIN to the same as before
    Given  I have been issued a new card
     And   I insert the card, entring the correct PIN (1234)
     When  I choose "Change PIN" from the menu
     And   I change the PIN to (1234)
     Then  I should see a message "Same Pin as before. Pin is not changed"