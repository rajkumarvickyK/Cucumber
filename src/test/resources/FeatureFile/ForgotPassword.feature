@Forgotpass 
Feature: 
  To validate forgoten password functionality in fb app
@Regression
  Scenario: 
    To validate forgoten password using invalid mobile number

    Given User have to enter fb login page
    And User have click forgoten option
    When User have to enter invalid mobile number
    And User have to click search button
    Then User have to invalid page
