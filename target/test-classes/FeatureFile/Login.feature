@Login
Feature: 
  To Validate Login Functionality in Fb App

  Background: 
    Given User have to enter fb login page
@smoke
  Scenario: 
    To validate login by using valid email and invalid password

    When User have to enter valid email and invalidpass
   
    And User have to click buttton
    Then User have to invalid credentials
@smoke @sanity
  Scenario: 
    To validate login by using invalid email and invalid password

    And User have to maxmize the window
    When User have to enter invalid email and invalidpass
    And User have to click buttton
    Then User have to invalid credentials
@smoke @Regression
  Scenario: 
      To validate login by using invalid email and valid password

    And User have to maxmize the window
    When User have to enter invalid email and validpass
    And User have to click buttton
    Then User have to invalid credentials
