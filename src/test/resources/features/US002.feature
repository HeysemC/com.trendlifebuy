@US002
Feature: Home page sayfasının üst menüsündeki fonksiyonların aktif olduğunu doğrulayın.

  # Apple Store linki Google Store'a yonlendiriyor
  Scenario Outline: TC001 Play store ve apple store butonları ilgili sayfaya yönlendirmeli.
    * Kullanici trendlifebuy.com adresine gider.
    * Market linkinin "<market>" dogru sayfaya yönlendirdigini kontrol eder.
    * Browser'i kapatir.

    Examples:
    |market       |
    |Google Store |
    |Apple Store  |

  Scenario: [TC002] Track Your Order butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * Track Your Link linkine tiklar ve yönlendirilen sayfayi dogrular.
    * Browser'i kapatir.

  Scenario: [TC003] Compare butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * Compare linkine tiklar ve yönlendirilen sayfayi dogrular.
    * Browser'i kapatir.

  Scenario: [TC004] Kullanıcı olarak giriş yapıldıktan sonra Wishlist butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * Wishlist linkine tiklar ve aktif bir hesapla kullanici girisi yapar.
    * Browser'i kapatir.

  Scenario: [TC005] cart butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * Cart linkine tiklar ve yönlendirilen sayfayi dogrular.
    * Browser'i kapatir.

  Scenario: [TC006] logoya basıldığında ana sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * Logo'ya tiklar ve yönlendirilen sayfanin anasayfa oldugunu dogrular.
    * Browser'i kapatir.

  Scenario: [TC007] search box dan ürün araması yapılabilmeli
    * Kullanici trendlifebuy.com adresine gider.
    * Searchbox'a "phone" yazar ve aratir, yonlendirilen sayfanin arama sonuc sayfasi oldugunu dogrular.
    * Browser'i kapatir.

  Scenario: [TC008] login butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * Login linkine tiklar ve yönlendirilen sayfayi dogrular.
    * Browser'i kapatir.

  Scenario: [TC009] register butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * Register linkine tiklar ve yönlendirilen sayfayi dogrular.
    * Browser'i kapatir.

  # Home linki https://trendlifebuy.com/ adresine yonlendiriyor
  Scenario: [TC010] home butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * Home linkine tiklar ve yönlendirilen sayfayi dogrular.
    * Browser'i kapatir.

  Scenario: [TC011] blog butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * Blog linkine tiklar ve yönlendirilen sayfayi dogrular.
    * Browser'i kapatir.

  Scenario: [TC012] About Us butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * About Us linkine tiklar ve yönlendirilen sayfayi dogrular.
    * Browser'i kapatir.

  Scenario: [TC013] Contact butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * Contact linkine tiklar ve yönlendirilen sayfayi dogrular.
    * Browser'i kapatir.

  Scenario: [TC013] New User Zone butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * New User Zone linkine tiklar ve yönlendirilen sayfayi dogrular.
    * Browser'i kapatir.