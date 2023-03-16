Feature: signup Feature
  //@regression @smoke @sanity
  Scenario: User should be able to create a new account
    Given User in TalentTek Homepage
    And I click on the create new account
    And user should be on TalentTek signup page
    When User enter firstname
    And  user enter lastname
    And User enter email address
    And User enter Password
    And User enter same Password in Confirm Password
    And User enter Birthdate By month,day,year
    And User select Gender
    And User select to agree "term and condition"
    When User Click on Create my account button
    Then User should successfully signup brand new account

