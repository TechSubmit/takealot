
Feature: Registration functionality
  Scenario: As a user I should register successfully
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



