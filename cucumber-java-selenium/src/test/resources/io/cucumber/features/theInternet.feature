Feature: The Internet
  This feature covers (some) Example pages on 'the-internet.herokuapp.com'

  @TEST_TI_0001
  Scenario: Homepage has a list of links to Expected examples
    Given the page under test is 'https://the-internet.herokuapp.com'
    And the Home Page is visible
    Then The "A/B Testing" link is displayed
    And The "Add/Remove Elements" link is displayed
    And The "Basic Auth" link is displayed
    And The "Broken Images" link is displayed
    And The "Challenging DOM" link is displayed
    And The "Context Menu" link is displayed
    And The "Digest Authentication" link is displayed
    And The "Disappearing Elements" link is displayed
    And The "Drag and Drop" link is displayed
    And The "Dropdown" link is displayed
    And The "Dynamic Content" link is displayed
    And The "Dynamic Controls" link is displayed
    And The "Dynamic Loading" link is displayed
    And The "Entry Ad" link is displayed
    And The "Exit Intent" link is displayed
    And The "File Download" link is displayed
    And The "File Upload" link is displayed
    And The "Floating Menu" link is displayed
    And The "Forgot Password" link is displayed
    And The "Form Authentication" link is displayed
    And The "Geolocation" link is displayed
    And The "Horizontal Slider" link is displayed
    And The "Infinite Scroll" link is displayed
    And The "Inputs" link is displayed
    And The "JavaScript Alerts" link is displayed
    And The "JavaScript onload event error" link is displayed
    And The "Key Presses" link is displayed
    And The "Large & Deep DOM" link is displayed
    And The "Multiple Windows" link is displayed
    And The "Nested Frames" link is displayed
    And The "Notification Messages" link is displayed
    And The "Redirect Link" link is displayed
    And The "Secure File Download" link is displayed
    And The "Shadow DOM" link is displayed
    And The "Shifting Content" link is displayed
    And The "Slow Resources" link is displayed
    And The "Sortable Data Tables" link is displayed
    And The "Status Codes" link is displayed
    And The "Typos" link is displayed
    And The "WYSIWYG Editor" link is displayed

  @TEST_TI_0002
  Scenario: Basic Auth allows validated access
    Given the page under test is 'https://the-internet.herokuapp.com'
    When the "Basic Auth" link is opened
    And valid credentials "admin" and "admin" are supplied
    Then Congratulations should be displayed

  @TEST_TI_0003
  Scenario: Sortable Data Tables - Example 1 displays the expected 4 results
    Given the page under test is 'https://the-internet.herokuapp.com'
    When the "Sortable Data Tables" link is opened
    Then table displays the following results correctly
