Feature: Login feature

  Background:
    Given I am on the login page


  @librarian
  Scenario: Login as a librarian
    When I login as a librarian
    Then dashboard should be displayed