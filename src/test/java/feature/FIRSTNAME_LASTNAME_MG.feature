#Author: Keneth Aponte

#Password must be at least 6 characters long with at least one number and at least one special character 
#According to the Word document, No code is required as part of this answer 


Feature: Automation Tester Pre-Interview Test 
 According to the Word document, No code is required as part of this answer 
  

  @Question2
  Scenario: Join Now Form
    Given I open CHROME
    Then I navigate to Money Gaming web page
    And I click on Join Now in Home Page
    Given I populate form with required info
    And I validate password length
    And I validate password contains at least 1 number
    And I validate password contains at least 1 special char 
    Then I click Join Now
  

