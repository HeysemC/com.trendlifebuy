Feature:[US030] As an administrator, I would like to have the notifications section on the main page in order to be
  informed about the activities on

  Scenario: [TC001]It should be verified that the Notifications text is visible in the window
  that opens when the Notifications icon is clicked.
    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in buttonn
    Then Click on the Notifications icon
    Then Verify that the Notifications text is visible
    Then  Close the page

  Scenario: [TC002]When the Notifications icon is clicked, it should be verified that it redirects to
  the user-notification page when the Setting button is clicked in the window that opens.
    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in buttonn
    Then Click on the Notifications icon
    Then Click the Setting button
    And Verified to redirect to user-notification page
    Then  Close the page


  Scenario: [TC003]It should be verified that the information message type (active/passive) can be changed
  in the Personal Notification Setting List on the User-Notification page.
    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in buttonn
    Then Click on the Notifications icon
    Then Click the Setting button
    Then it should be confirmed that the information message type can be changed on the page that opens.



  Scenario: [TC005]IIt should be verified that when the View button is clicked on the menu that opens when
  the Notifications icon is clicked, it redirects to the relevant page.
    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in buttonn
    Then Click on the Notifications icon
    And   Clicking the View button will take you to the relevant page

  @US030
  Scenario: [TC004]It must be verified that the information messages (as read) are deleted from the window when the
  Read All button is clicked in the menu that appears when clicking on the Notifications icon.
    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in buttonn
    Then Click on the Notifications icon
    And Click on the Read All button to verify that the messages have been deleted from the window