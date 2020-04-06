Feature: JMS Login

  Background: 
    Given User is on "LoginPage"

  Scenario: Valid credentials
    Then Validate user is on "LoginPage"
    When User enters "AKS1009" in "UserName"
    And User clicks on "Proceed" Button
    And User enters "Abcd1234" in "Password"
    And User clicks on "Proceed" Button
    And User clicks on "Confirmation" Button if  present
    Then Validate user is on "HomePage"

  Scenario: Invalid credentials
    Then Validate user is on "LoginPage"
    When User enters "AKS1009" in "UserName"
    And User clicks on "Proceed" Button
    And User enters "Abcd12345" in "Password"
    And User clicks on "Proceed" Button
    Then Validate "Invalid Credentials" is inner text of "Warning_Message"
