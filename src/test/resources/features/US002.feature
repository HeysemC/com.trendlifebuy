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

  Scenario: [TC_002] Track Your Order butonu ilgili sayfaya yönlendirmeli
    * Kullanici trendlifebuy.com adresine gider.
    * "Track Your Link" linkine tiklar ve yönlendirilen sayfayi dogrular.
    * Browser'i kapatir.