Feature: Open google.com feature

Scenario: Open Google Website and Search
Given Open the browser
Given user is entering google.com
When the user clicks the searchbox
And types the search term as "Juliet"

Then the user should be able to see the search results for Juliet