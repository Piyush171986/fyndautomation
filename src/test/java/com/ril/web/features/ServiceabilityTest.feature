# new feature
# Tags: optional

Feature: Cases to test Serviceability


  Scenario: Procead with the Valid Pincode.
    Given Login with a "Institution" Merchant
    Then Merchant should be looged in
    When Enter the Pincode as "400708" and apply
    Then Non Serviceable Error should not come


  Scenario: Procead with the Valid Pincode.
    Given Login with a "Institution" Merchant
    Then Merchant should be looged in
    When Enter the Pincode as "999999" and apply
    Then Non Serviceable Error should come




  Scenario: Procead with the Valid Pincode.
    Given Login with a "Horeca" Merchant
    When Enter the Pincode as "400708" and apply