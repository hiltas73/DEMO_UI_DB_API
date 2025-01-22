Feature: Login feature

  Background:
    Given I am on the login page


  @librarian
  Scenario: Login as a librarian
    When I login as a librarian
    Then dashboard should be displayed

  @student
  Scenario: Login as a student
    When I login as a student
    Then books should be displayed


  @librarianParam
  Scenario: Login as librarian 49
    When I enter username "librarian49@library"
    And I enter password "libraryUser"
    And click the sign in button
    And there should be "5255" users
    Then dashboard should be displayed