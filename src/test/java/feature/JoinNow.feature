#Author: Keneth Aponte


Feature: Automation Tester Pre-Interview Test 
 Automation Tester Pre-Interview Test 

  @Question1
  Scenario: Join Now Form
    Given I open CHROME
    Then I navigate to Money Gaming web page
    And I click on Join Now in Home Page
    Given I populate form with title 'Mr' firstName 'Keneth' lastName 'Aponte' 
    Then I click Join Now
    And I validate error msg

