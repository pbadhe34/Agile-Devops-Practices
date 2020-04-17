Feature: GetSqureRoot

 Scenario: TestSquareRoot
  Given User opens the application
  When User enters number to get squareroot
  Then The matching squareRoot value should be displayed
  
 Scenario: TestWithParams
   Given User opens the application with "Test" message
   When User enters number 100 to get squareroot
   Then The matching squareRoot value 10 should be displayed
  
  Scenario: TestWithParams
   Given User opens the application with "Welcome" message
   When User enters number 400 to get squareroot
   Then The matching squareRoot value 20 should be displayed
  