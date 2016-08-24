@screen
Feature: Contact

  Scenario: Contact successfully
    Given I open "http://recogroup.co.uk/"
    And I wait 1 seconds
    And I click on link with text "Contact"
    And I type "Ruben" into "Name" field
    And I type "testare1984@gmail.com" into "Email" field
    And I type into message field

