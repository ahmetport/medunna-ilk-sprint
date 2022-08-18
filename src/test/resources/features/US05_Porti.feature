@makeAppointmentPage
Feature: Make_An_Appointment

  Scenario Outline:make_appoinment_page
    Given User Go to Medunna home page
    Then User verifies if the Make an appointment button exits.
    When User clicks on the Make an Appointment button.
    Then User fill name with correct credential "<firstName>"
    And User fill lastname with correct credential  "<lastName>"
    And User fill email with correct credential "<email>"
    And User fill phone number with correct credential "<phoneNumber>"
    And User fill SSN Number with correct credential "<ssnNumber>"
    And user fills in the date as "<date>"
    Then user validates the appointment
    Examples:
      |firstName|lastName|email|phoneNumber|ssnNumber|date|
      |Porti9|Porti8|porti9_porti9@hotmail.com|364-335-3564|519-78-6319|05-11-2025|


  Scenario Outline: Registration
    Given User Go to Medunna home page
    Then User clicks on Register Button
    And User fill SSN Number on Registration Page  "<ssnNumber>"
    And User fill Name with on Registration Page "<firstName>"
    And User fill lastName with on Registration Page "<lastName>"
    And User fill Username on Registration Page "<userName>"
    And User fill email on Registration Page "<email>"
    And User fill password on Registration Page "<password>"
    And User fill confirm password on Registration Page "<confirmPassword>"
    And User click Register button.

    Examples:
      |ssnNumber|firstName|lastName|userName|email|password|confirmPassword|
      |519-78-6319|Porti9|Porti8|patient9_patient6|porti9_porti6@hotmail.com|6yhn3edc.|6yhn3edc.|

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

