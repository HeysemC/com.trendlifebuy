@US0035
  Feature: As an administrator, I want the product lists page to
    be able to access the product lists on the site.
   # Bir yönetici olarak sitedeki ürünler listelerine erisebilmek
   # icin ürün listeleri  sayfasinin olmasini istiyorum.



  Scenario: 1-Verify that the Product List page is accessible from the Products menu.
    # Products menusunden Product List sayfasina erisilebilir oldugu dogrulanmali.

    * Login to Trendlifeby page as admin
 # Trendlifeby sayfasına admin olarak giris yapılır
    * Click on the Products button
   # Products butonuna tıklanır
    * Click the ProductsList button
   # ProductsList butonu tıklanır
    * Verifies that the ProductsList page is visible
   # ProductsList sayfası gorunur oldugu dogrulanır
    * closes the page
   # sayfayı kapatır

  Scenario: 2-Product List, Alert List, Out Of Stock List,Disabled Product List,
  Product By SKU List links are visible and it is verified that they go to the relevant page
  # Product List sayfasinda Product List, Alert List, Out Of Stock List,
  # Disabled Product List, Product By SKU List linklerinin görünür ve ilgili sayfaya gittigi dogrulanir

    * Login to Trendlifeby page as admin
   # Trendlifeby sayfasına admin olarak giris yapılır
    * Verifies that it goes to the Prouducts List page
  #Prouducts List sayfasına gittigi dogrulanır
    * Verified visibility of ProductList, AlertList, OutOfStockList, DisabledProductList, ProductBySKUList links
  #ProductList, AlertList, OutOfStockList, DisabledProductList,
  #ProductBySKUList linklerinin görünürlügü dogrulandı
   *  closes the page
   # sayfayı kapatır