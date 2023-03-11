
Feature:  US034 - Bir yönetici olarak siteye yeni bir ürün eklemek icin Add New Product sayfasinin olmasini istiyorum.

  Scenario: [TC001] - Products acilir penceresinden Add New Product sayfasina erisilebildigi dogrulanmali.

    Given Navigatee to "adminUrl"
    And   Entere "validUsername" and "validPassword" and click sing in button
    Then  Click Add New Product button
    Then  Verify Add New Product is displayed
    Then  Closee the page

  Scenario: [TC002] - Add New Product sayfasinda(General Information, Related Product, Up Sale, Cross sale) bölümlerinin oldugunu dogrulanmali

    Given Navigatee to "adminUrl"
    And Entere "validUsername" and "validPassword" and click sing in button
    Then Click Add New Product button
    Then Verify General Information, Related Product, Up Sale, Cross sale is displayed
    Then Closee the page

  Scenario: [TC003] - Product Information bölümünde Type seceneklerinin oldugu ve secilen Type göre istenilen bilgilerin degistigi dogrulanmali.

    Given Navigatee to "adminUrl"
    And Entere "validUsername" and "validPassword" and click sing in button
    Then Click Add New Product button
    Then Product Information bölümünde Type seceneklerinin oldugu dogrulanmali
    Then Secilen Type göre istenilen bilgilerin degistigi dogrulanmali
    Then Closee the page

  Scenario: [TC004] - Product Information Bölümünde Name,Product SKU,Model Number,Category,Brand, Unit,Barcod Type,Minimum Order QTY,Max Order QTY,Tags Text Box'larinin görünür oldugu dogrulanmali.

    Given Navigatee to "adminUrl"
    And Entere "validUsername" and "validPassword" and click sing in button
    Then Click Add New Product button
    Then Name,Product SKU,Model Number,Category,Brand, Unit,Barcod Type,Minimum Order QTY,Max Order QTY,Tags Text Box'larinin görünür oldugu dogrulanmali
    Then Closee the page

  Scenario: [TC005] - Product Information bölümündeki  Category Add New linkine tıklandığında Create Category penceresinin açıldığı doğrulanmalı

    Given Navigatee to "adminUrl"
    And Entere "validUsername" and "validPassword" and click sing in button
    Then Click Add New Product button
    Then Category Add New linkine tıklandığında Create Category penceresinin açıldığı doğrulanmalı
    Then Closee the page
