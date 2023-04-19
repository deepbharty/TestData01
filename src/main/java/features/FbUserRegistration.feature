
Feature: Facebook user registration

  Scenario: Verify the user registration process
    Given launch the browser and enter application URL
    When User navigated to facebook registration page
    Then enter all the required details
    And click on the signup button
    Then Validate the registration 