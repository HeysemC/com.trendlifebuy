@US002
Feature: Home page sayfasının üst menüsündeki fonksiyonların aktif olduğunu doğrulayın.

  Scenario Outline: TC001 Play store ve apple store butonları ilgili sayfaya yönlendirmeli.
    * Kullanici trendlifebuy.com adresine gider.
    * Market linkinin "<market>" dogru sayfaya yönlendirdigini kontrol eder.
    * Browser'i kapatir.

    Examples:
    |market       |
    |Google Store  |
    |Apple Store |

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