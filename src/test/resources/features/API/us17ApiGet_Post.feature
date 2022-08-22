@ApiRegistrant
Feature:Test items(öğe) Oluştur / Güncelle / Sil
  @TC005
  Scenario: admin API ile dogrulama yapar
    Given  admin items icin url alma istegi gonderir
    And admin Status Code 200 oldugunu dogrular
    Then kullanici API kayitlarini onaylar

