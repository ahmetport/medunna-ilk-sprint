@test02
Feature:
  US06 TC02-03-04

  Scenario Outline:
    Given AP Kullanici medunna.com adresine gider
    And AP Kullanici Account Menu ikonuna tiklar
    And AP Kullanici sign in secenegine tiklar
    And AP Kullanici username kutusuna "<username>" girer
    And AP Kullanici Password kutusuna "<password>" girer
    And AP Kullanici sign in butonuna tiklar
    And AP Kullanici sag ust kosede bulunan kullanici ismine tiklar
    And AP Kullanici settings secenigine tiklar
    And AP kullanici firstname kutusuna yeni "<newFirstname>" yazar
    And AP kullanici lastname kutusuna yeni "<newLastname>" yazar
    And AP kullanici email kutusuna yeni "<newEmail>" yazar
    And AP kullanici save butonuna basar ve degisiklikleri kaydeder
    Then AP kullanici uygulamayi kapatir


    Examples: test-data
      |username|password|newFirstname|newLastname|newEmail|
      |PHYSICIAN51 |Physician1234.|Physician51|PROJECT51|physician51@gmail.com|
      |PATIENT51|Patient1234.|PATIENT|PROJECT|patient51@gmail.com|
      |STAFF51|Staff1234.|Staff|PROJECT|staff51@gmail.com|