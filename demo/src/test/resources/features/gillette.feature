Feature: Webpage Testing

  Scenario: Verify page title
    Given User navigates to the webpage
    When The page title is captured
    Then The page title should contain "Expected Title"

  # Other scenarios...
