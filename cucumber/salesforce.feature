Feature: Create Account in Salesforce

  Scenario: Create a new Account with Public ownership
    Given User launches the Salesforce login page "https://login.salesforce.com"
    When User logs in with valid credentials
    And User clicks on the toggle menu button
    And User clicks on View All from App Launcher
    And User selects Sales application
    And User clicks on Accounts tab
    And User clicks on New button
    And User enters account name as "your name"
    And User selects Ownership as "Public"
    And User clicks on Save button
    Then User should see the account created with name "your name"
