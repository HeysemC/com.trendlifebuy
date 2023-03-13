
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

  Scenario:[TC004] When the View link is clicked, it should be verified that its Status is the same as the gift card
  status selected in the Gift Card List.

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    And   Click status button
    And   Verify that the status of the gift card can be changed to active or inactive
    And   Close the page


  Scenario: [TC005]Verify that View,Edit and Delete links are visible in the
            Select tab under the Actions heading in the Gift Card List.

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    Then  Click select button
    And   Verify view,edit and delete links are visible
    And   Close the page


  Scenario:[TC006] On the page that opens when the View link is clicked on the Select tab under the Actions heading,
           it should be verified that the name in the Name field and the gift card name selected in the
           Gift Card List are the same.

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    And   Verify that the name in the Name field and the gift card name selected in the Gift Card List are the same
    And   Close the page

  Scenario:[TC007] It should be verified that the gift card selected under the
  Status Title in the Gift Card List can be set as active or passive.

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    And   Verify that when we click this button, the status of this button has changed
    And   Close the page

  Scenario:[TC008] It should be verified that it redirects the gift card to the print page with the Print button.

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    And   Click print button
    And   Verify that it redirects the gift card to the print page
    And   Close the all pages


  Scenario:[TC009] When the Edit link is clicked on the Select tab under the Actions heading,
           it should be verified that it redirects to the Edit Gift Card page.

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    Then  Click select button
    Then  Click edit button
    And   Verify that it redirects to the Edit Gift Card page
    And   Close the page

  @US036
  Scenario Outline:[TC010]On the Edit Gift Card page, it should be verified that the relevant gift card has Name, SKU, Thumbnail Image,
           Selling Price, Shipping Methods, Galary Image,Discount, Discount Type, Status, Discount Period and Tag information

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    Then  Click select button
    Then  Click edit button
    And   Verify that required "<informations>" on the Edit Gift Card page
    And   Close the page
    Examples:
      | informations   |
      |Name            |
      |SKU             |
      |Thumbnail Image |
      |Selling Price   |
      |Shipping Methods|
      |Galary Image    |
      |Discount        |
      |Discount Type   |
      |Status          |
      |Discount Period |
      |Tag             |
      |Description     |


  Scenario:[TC011]After editing the required information of the gift card on the Edit Gift Card page,
           it should be verified that it can be updated by clicking the Update button.

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    Then  Click select button
    Then  Click edit button
    Then  Edit name "Tom" sellingPrice "300" and sku "newYear" information
    And   Veriyf that it can be updated by clicking the Update button
    And   Close the page

  Scenario:[TC012]It should be verified that the relevant gift card can be deleted from the window that opens by clicking the
            Delete link from the Select tab under the Actions heading.

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    Then  Click select button
    Then  Click delete button and click delete data button
    Then  Verify that the relevant gift card can be deleted from the window
    And   Close the page

  Scenario: [TC013]According to the search information entered in the Quick Search Text Box, it should be verified that
            the results are displayed in the Gift Card List.

    Given Navigate to "adminUrl"
    Then  Enter "validUsername" and "validPassword" and click sing in button
    Then  Click giftCard button
    Then  Click giftCardList
    Then  Click quick search and enter an "gift"
    And   Verify that is displayed this "gift" in Gift Card List

