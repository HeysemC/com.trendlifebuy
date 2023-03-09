
Feature:[US036] As an administrator, I would like to have a page that can perform these functions to prepare,
         edit or delete gift cards for site users

  Scenario:[TC001] It should be verified that the Gift Card List page is accessible from the Gift Card
            tab in the Promotional menu on the Dashboard Side Bar.

    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Verify giftCardList is displayed
    Then  Close the page


  Scenario:[TC002]Verify that the Gift Card List is visible on the Gift Card List page

    Given Navigate to "adminUrl"
    And   Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    Then  Verify that the gift cart list can be displayed on the page
    Then  Close the page

  Scenario:[TC003] In the Gift Card List, it should be verified that the gift cards are listed according to
            Name, SKU, Thumbnail Image, Selling Price, Number of Sale and Status information.

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    Then  Verify that Name,SKU,Thumbnail Image,Selling Price,Number of Sale and Status information is displayed
    Then  Close the page
  @US036
  Scenario: [TC005]Verify that View,Edit and Delete links are visible in the
            Select tab under the Actions heading in the Gift Card List.

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    Then  Click select button
    And   Verify view,edit and delete links are visible
    And   Close the page

