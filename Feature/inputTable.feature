Feature: To Get the Table Data

Scenario: Get the table row data
		Given User Launch Chrome Browser
    When User open URL "https://demo.aspnetawesome.com"
    When User Search for the Input ID "1113" and get result
    And close browser