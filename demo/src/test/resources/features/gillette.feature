Feature: Webpage Testing

  Scenario: Verify page title
    Given User navigates to the webpage
    When The page title is captured
    Then The page title should contain "Expected Title"

  Scenario: Search Google for images
    Given User navigates to Google
    When User searches for "Images"
    Then Search results for images are displayed

  Scenario: Perform Google searches using URL query parameters
    Given User navigates to Google with query parameters
    When User searches with the provided query
    Then Search results matching the query are displayed

  Scenario: Basic tests against Wikipedia
    Given User navigates to Wikipedia
    When User searches for "Picking a language"
    Then Search results link to the correct articles

  Scenario: Viewing page 5
    Given User navigates to a webpage
    When User selects page 5
    Then Page 5 should be displayed

  Scenario: Basic service-level testing using REST Assured
    Given REST endpoint "https://jsonplaceholder.typicode.com/posts/1"
    When GET request is sent
    Then Response status code should be 200

