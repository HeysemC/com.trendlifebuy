Feature: [US032]As an administrator, I would like the pages to be listed in a Side Bar under categories
  so that I can easily access the pages in the Dashboard panel.

  Scenario: [TC001] Verify that the Dashboard menu title is visible in the Dashboard Side Bar.

    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in buttonn
    Then Confirms that the Dashboard menu item is visible
  @US032
  Scenario: [TC002] Verify that the Dashboard menu title is visible in the Dashboard Side Bar.

    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in buttonn
    And Click on Dashboard and go to admin-dashboard page