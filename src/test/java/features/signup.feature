Feature: signup Feature
  @regression @smoke @sanity
  Scenario : User should be able to create a new account
    Given user should be on TalentTEK homepage
    And User click on the "Create new account" button
    And User enter First and last name
    And User enter email address
    And User enter Password and Confirm password
    And User enter month under Birthdate
    And User enter date under Birthdate
    And User enter year under Birthdate
    And User select Gender as "female"
    And User select to agree term and condition checkbox
    When User Click on Create my account button
    Then User should be able to get their studentID
    #Then User should successfully signup brand new account
  @Test
  Scenario Outline: Create a new user with given list
    Given user should be on TalentTEK homepage
    And User click on the "Create new account" button
    And user enter "<First>" and "<Last>" Name
    Examples:
      |First|Last|
      |QA   |TEST|
      |SAP |PAT|