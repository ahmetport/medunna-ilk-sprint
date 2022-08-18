@test01
Feature:06_TC_01_Kullanıcı bilgileri



  Scenario Outline:  "firstname, lastname, email" girerken doldurulan kullanıcı bilgileri olmalıdır
    Given AP Kullanici medunna.com adresine gider
    And AP Kullanici Account Menu ikonuna tiklar
    And AP Kullanici sign in secenegine tiklar
    And AP Kullanici username kutusuna "<username>" girer
    And AP Kullanici Password kutusuna "<password>" girer
    And AP Kullanici sign in butonuna tiklar
    And AP Kullanici sag ust kosede bulunan kullanici ismine tiklar
    And AP Kullanici settings secenigine tiklar
    And AP Firstname kutusundaki isim kayit olurken girilen "<firstname>" olmali
    And AP last name  kutusundaki soy isim kayit olurken girilen "<lastname>" olmali
    And AP email kutusundaki mail adresi  kayit olurken girilen "<email>" olmali
    And AP kullanici uygulamayi kapatir



    Examples:test_data
      |username|password|firstname|lastname|email|
      |PATIENT51|Patient1234.|PATIENT|PROJECT|patient51@gmail.com|
      |PHYSICIAN51 |Physician1234.|Physician51|PROJECT51|physician51@gmail.com|
      |STAFF51|Staff1234.|Staff|PROJECT|staff51@gmail.com|