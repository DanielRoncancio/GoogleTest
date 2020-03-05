# language: en
Feature: : Google homepage search


  Scenario: User can search with "Google Search"
    Given Im on the homepage
    When I type "The name of the wind" into the search field
        And I clic the Google Search button
    Then I go to the search result page
        And The first result is "The name of the Wind - Patrick Rothfuss"
    When I click on the first result link
    Then I go to the "Patrick Rothfuss - The Books" page

  Scenario: User can search by using the suggestions
    Given I’m on the homepage
    When I type "The name of the w" into search field
    And the suggestions list is displayed
    And I click on the first suggestion in the list
    Then I go to the search results page
    And the first result is “The Name of the Wind - Patrick Rothfuss”
    When I click on the first result linkk
    Then I go to the “Patrick Rothfuss - The Books” page



