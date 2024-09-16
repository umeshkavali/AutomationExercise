Feature: Create a New User

  Scenario Outline: User Account Creation
    Given User launch the browser
    Then User navigates to the URL "https://automationexercise.com/"
    And User verify the home page is visible successfully
    Then User clicks on SignUp or Login button
    And User Verify New User Signup! is visible
    Then User should enter the name as "Umesh" and password as "Test@123"
    And User Click on Signup button
    Then User Verify that ENTER ACCOUNT INFORMATION is visible
    Then User should fill the below details
      | Title    |
      | Password |
      | Date     |
      | Month    |
      | Year     |
    And User Select Sign up for our newsletter! checkbox
    And User Select Receive special offers from our partners! checkbox
    Then User should fill the below details
      | First name    |
      | Last name     |
      | Company       |
      | Address       |
      | Address2      |
      | Country       |
      | State         |
      | City          |
      | Zipcode       |
      | Mobile Number |
    And User Click on Create Account button
    Then User Verify that ACCOUNT CREATED! is visible
    And User Click Continue button
    Then User Verify that Logged in as username is visible
    Then User Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible and click Continue button
