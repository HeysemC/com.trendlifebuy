@US001
Feature: US001 - Bir kullanıcı olarak anasayfaya erişebilmeliyim

  Scenario: TC001 - URL girildiğinde ana sayfa erişilebilir olmalıdır.
    * Kullanici trendlifebuy.com adresine gider.
    * URL'in "qa.trendlifebuy.com" oldugunu dogrular.
    * Browser'i kapatir.

  Scenario: TC002 - Siteye girerken title'ın Trendlifebuy Online Shopping olduğundan emin olunmalıdır.
    * Kullanici trendlifebuy.com adresine gider.
    * Sitenin title'inin "Trendlifebuy Online Shopping" oldugunu dogrular.
    * Browser'i kapatir.