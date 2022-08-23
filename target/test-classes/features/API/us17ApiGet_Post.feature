@ApiRegistrant
Feature:Test items(öğe) Oluştur / Güncelle / Sil
  @TC005
  Scenario: admin API ile dogrulama yapar
    Given  admin items icin url alma istegi gonderir
    And admin Status Code 200 oldugunu dogrular
    Then kullanici API kayitlarini onaylar


  @TC006

  Scenario:admin API ile items olusturur
    And Api kullanarak yeni bir data olusturma "c-test-items" uzerinde post etme
    And kullanici post request validition yapar
