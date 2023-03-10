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


  Scenario: 3- Products in Product List SL, Name, Product Type, Brand, Image,
   Verify that it is listed under the headings Stock, Status, Action
  # Product List'te ürünler SL, Name, Product Type, Brand, Image,
  # Stock, Status, Action basliklari altinda listelendigi dogrulanir

  * Login to Trendlifeby page as admin
  * Go to Prouducts List page
    #Prouducts list sayfasına gidilir
  * SL, Name, Product Type, Brand, Image, It appears to be listed under the headings Stock, Status, Action
    # SL, Name, Product Type, Brand, Image,
    # Stock, Status, Action basliklari altinda listelendigi gorulur


  Scenario: 4-Quick Search TextBox'i ile Product List icerisinde arama yapilabildigi dogrulanmali
  # Quick Search TextBox'i ile Ürün Listesi icerisinde arama yapilabildigi dogrulanmali

  * Login to Trendlifeby page as admin
  * Go to Prouducts List page
  * Verified that Quick Search TextBox button is active
   #Quick Search TextBox butonunun aktif oldugu dogrulandı


  Scenario: 5-It should be verified that the product status can be changed from the Status column
  in the Product List.
    # 5-Product List icerisinde Status sütunundan ürün statusu degistirilebildigi dogrulanmali

    * Login to Trendlifeby page as admin
    * Go to Prouducts List page
    * Product status can be changed from the Status column in the Product List verified.
    # Product List icerisinde Status sütunundan ürün statusu degistirilebildigi
    #dogrulandı