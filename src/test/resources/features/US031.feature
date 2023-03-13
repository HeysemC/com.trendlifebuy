Feature:[US031] As an administrator, in order to access my profile information and logout,
  I want the profile I am logged into to be visible on the top bar of the dashboard homepage.

  Scenario: [TC001]Verify that the profile icon is visible on the top bar of the Dashboard home page.

    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in button
    And  Then  Verify  is displayed verify that the profile icon is visible
    Then  Close the page

    Scenario: [TC002]When the Notifications icon is clicked, it should be verified that it redirects to the
    user-notification page when the Setting button is clicked in the window that opens.
      Given Navigate to "adminUrl"
      And   Enter "validUsername" and "validPassword" and click sing in button
      Then  Click profilikon button
      Then verify that the account's Name appears


  Scenario: [TC003]It should be verified that the My profile and Log out links are visible in the window that opens
  when the profile icon is clicked.
    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in buttonn
    Then  Click profilikon button
    Then Verify that the My profile and Log out links are visible

  Scenario: [TC004]It should be verified that the My profile and Log out links are visible in the window that opens
  when the profile icon is clicked.
    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in buttonn
    Then  Click profilikon button
    Then Confirms that clicking on the My Profile link takes you to the profile page

  Scenario: [TC007]It must be verified that the address information appears on the page that opens when you click on the Adress button on the profile page.
    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in buttonn
    Then  Click profilikon button
    Then  Click my profile button
    And Click address button
    And verify that the address information appears on the page
  @US031
    Scenario: [TC008]When the Add New Address button is clicked, it should be verified that a new address can be added
    to the account logged in from the page that opens and that the added addresses are visible on the address page.

      Given Navigate to "adminUrl"
      And   Enter "validUsername" and "validPassword" and click sing in buttonn
      Then  Click profilikon button
      Then  Click my profile button
      And  Click address button
      Then Click AddNewAddress button
      And  Verifies that a new address can be added to the account and is visible on the address page