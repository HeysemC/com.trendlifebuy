@US0035
  Feature: As an administrator, I want the product lists page to
    be able to access the product lists on the site.




  Scenario: 1-Verify that the Product List page is accessible from the Products menu.

    * Login to Trendlifeby page as admin
    * Click on the Products button
    * Click the ProductsList button
    * Verifies that the ProductsList page is visible
    * closes the page


  Scenario: 2-Product List, Alert List, Out Of Stock List,Disabled Product List,
  Product By SKU List links are visible and it is verified that they go to the relevant page

   * Login to Trendlifeby page as admin
   * Verifies that it goes to the Prouducts List page
   * Verified visibility of ProductList, AlertList, OutOfStockList, DisabledProductList, ProductBySKUList links
   *  closes the page



  Scenario: 3- Products in Product List SL, Name, Product Type, Brand, Image,
   Verify that it is listed under the headings Stock, Status, Action

  * Login to Trendlifeby page as admin
  * Go to Prouducts List page
  * SL, Name, Product Type, Brand, Image, It appears to be listed under the headings Stock, Status, Action


  Scenario: 4-Quick Search TextBox'i ile Product List icerisinde arama yapilabildigi dogrulanmali

  * Login to Trendlifeby page as admin
  * Go to Prouducts List page
  * Verified that Quick Search TextBox button is active



  Scenario: 5-It should be verified that the product status can be changed from the Status column
  in the Product List.
    * Login to Trendlifeby page as admin
    * Go to Prouducts List page
    * Product status can be changed from the Status column in the Product List verified.

  Scenario: 6-Clicking on the select tab in the Action column in the Product List
    Verify that the View link is visible and displays the product

    * Login to Trendlifeby page as admin
    * Go to Prouducts List page
    * Clicked on the select tab in the Action column, verified that the View link is visible and displays the product


  Scenario:7-The Edit link is visible on the select tab in the Action column in the Product List.
      and when clicked it should verify that it redirects to the Edit Product page

    * Login to Trendlifeby page as admin
    * Go to Prouducts List page
    * Confirmed that Edit link is visible in Action select tab and when clicked it redirects to Edit Product page

  Scenario: 8-It should be verified that the current information of the product is available on the 8-Edit Product page.

    * Login to Trendlifeby page as admin
    * Go to Prouducts List page
    * Verified that the product's current information is available on the Edit Product page


  Scenario: 9-In the Product Information section, select the Type option. It should be verified
  that it cannot be changed and that the related message is visible

    * Login to Trendlifeby page as admin
    * Go to Prouducts List page
    * In the Product Information section, select the Type option. Verified that it has not been changed and the corresponding message is visible

  Scenario: 10-The information to be edited on the General Information, Related Product, Up Sale, Cross Sale pages
  After editing, it is verified that the edited information is saved with the Update button.

    * Login to Trendlifeby page as admin
    * Go to Prouducts List page
    * Information to be edited on the General Information, Related Product, Up-Selling, Cross-Selling pages After editing, it is verified that the saved information is saved with the Update button.

