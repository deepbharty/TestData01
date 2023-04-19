
Feature: feature to test Google Search functionality

  Scenario: Validate Google Search is Working
    Given Browser is Open
    And User is on Google Search Page
    When User entres a text in Google Search Box
    And Hit the Enter Button
    Then Navivgated to Search result Page
   