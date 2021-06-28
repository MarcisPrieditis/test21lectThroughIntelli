@SmokeTest
Feature: Validate dogs and cars filter functionality

  Background:
    Given Start Chrome
    And Open Homepage

  Scenario: Dogs filter functionality validation
    When Open Dogs tab
    Then Change min price 1 and max price 1000
    And Change min age 1 and max age 10
    And Press Search button
    And Close Chrome

  Scenario: Verify Cars tab functionality
    When Open Cars tab
    Then Fill min price 1000 and max price 10000
    And Fill min year 2007 and max year 2021
    And Select Engine type Benzins
    And Select gear type Automats
    And Select car type Apvidus
    And Select color Balta
    And Press submit button


#    //majasdarba pirmais limenis
#  Scenario: Open and change profile data
#    Given Open https://www.forumcinemas.lv
#    And Login
#    When Open profile page
#    And Validate that name is AAAAA
#    And Validate that surname is BBBBB
#    Then Change name to Test1
#    And Change surname to Test2
#    And Change DOB to 01/01/2001
#    And Save Changes

