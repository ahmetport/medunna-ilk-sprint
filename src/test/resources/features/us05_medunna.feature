Feature:
  Scenario: Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz.
    Given AP Kullanici medunna.com adresine gider
    And   Make appointment butonuna tiklar
    And   First name kutusuna uygun isim girer
    Then  hata mesajinin cikmadigini test eder
    Then AP kullanici uygulamayi kapatir



  Scenario: Kullanıcı SSN numarası girmeli (kayıtlı SSN) boş bırakılamaz.
    Given AP Kullanici medunna.com adresine gider
    And   Make appointment butonuna tiklar
    And   SSN kutusuna uygun ssn girer
    Then  SSN icin hata mesajinin cikmadigini test eder
    #Then AP kullanici uygulamayi kapatir

  Scenario:Kullanıcı, herhangi bir karakter içeren "Last Name" yazması gerekir, boş bırakılamaz.
    Given AP Kullanici medunna.com adresine gider
    And   Make appointment butonuna tiklar
    And   Last name kutusuna uygun lastname girer
    Then  Lastname icin hata mesajinin cikmadigini test eder
    Then AP kullanici uygulamayi kapatir

  Scenario:Kullanıcı "." ve "@" içeren e-mail adresi girmeli, boş bırakılamaz.
    Given AP Kullanici medunna.com adresine gider
    And   Make appointment butonuna tiklar
    And   e-mail kutusuna uygun e-mail girer
    Then  e-mail icin hata mesajinin cikmadigini test eder
    Then AP kullanici uygulamayi kapatir

  Scenario:Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını girmeli, boş bırakılamaz.
    Given AP Kullanici medunna.com adresine gider
    And   Make appointment butonuna tiklar
    And   Telefon kutusuna uygun telefon numarasi girer
    Then  Telefon numarasi icin hata mesajinin cikmadigini test eder
    Then AP kullanici uygulamayi kapatir


  Scenario:Kullanıcı randevu alıp kaydolduğunda, profillerini görebilir ve uygulamada oturum açabilir.
  @Sign_In
  Scenario Outline: Sign_In
    Given User Go to Medunna home page
    And User click Sign In Button
    And User fill Username on the Sign In Page "<userName>"
    And User fill Password on the Sign In page "<password>"
    And User click Sign In Submit Button
    When User click My Appointments Link
    And User see the Appointments

    Examples:
      |userName|password|
      |patient9_patient6|6yhn3edc.|


