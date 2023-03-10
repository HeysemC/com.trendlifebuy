Feature:[US031] As an administrator, in order to access my profile information and logout,
  I want the profile I am logged into to be visible on the top bar of the dashboard homepage.

  Scenario: [TC001]Verify that the profile icon is visible on the top bar of the Dashboard home page.

    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in button
    And  Then  Verify  is displayed verify that the profile icon is visible
    Then  Close the page
  @US031
    Scenario: [TC002]When the Notifications icon is clicked, it should be verified that it redirects to the
    user-notification page when the Setting button is clicked in the window that opens.
      Given Navigate to "adminUrl"
      And   Enter "validUsername" and "validPassword" and click sing in button
      Then  Click profilikon button
      Then verify that the account's Name appears

