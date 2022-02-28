
Feature: Search functionality
  Scenario: As a user I should choose my choice of watch brand
    Given I am on homepage of tekealot website
    When  I click on register link
    And   I enter first name "james"
    And   I enter last name "Orr"
    And   I enter email and retype email
    And   I enter password "teke@1234" and retype password
    And   I enter mobile number
    And   I tick on fashion check box
    And   I tick on music check box
    And   I tick on toys check box
    And   I click on register button
    Then  I Should see <"Welcome to the TAKEALOT.com family!">message on popup
    And   I click on here link on popup
    And   I enter "Watches" in search field
    And   I select  Garmin watch <"Garmin Forerunner 45 Sports Smartwatch (42mm) - Lava Red"> and add it to my cart
    And   I select Garmin  Watch Band <"Garmin QuickFit 22mm Silicone Watch Band - Flame Red">  and add it to my cart
    Then  I should verify that watches are added successfully on my basket
    And  verify "(2 items)" shows in cart