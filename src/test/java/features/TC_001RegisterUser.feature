Feature: Create a New User

  Scenario Outline: User Account Creation
    Given User launch the browser
    Then User navigates to the URL "https://automationexercise.com/"
    And User verify the home page is visible successfully
    Then User clicks on SignUp or Login button
    And User Verify New User Signup! is visible
    Then User should enter the name as "babgvildi" and emailId as "kjbvalvbd@mailinator.com"
    And User Click on Signup button
    Then User Verify that ENTER ACCOUNT INFORMATION is visible
    Then User should fill the below account information details
      | Title    | MrS.     |
      | Password | Test@123 |
      | Date     |       21 |
      | Month    | August   |
      | Year     |     1990 |
    And User Select Sign up for our newsletter! checkbox
    And User Select Receive special offers from our partners! checkbox
    Then User should fill the below address information details
      | First name    | Umesh     |
      | Last name     | Kavali    |
      | Company       | Prolifics |
      | Address       | HYD       |
      | Address2      | HYD2      |
      | Country       | India     |
      | State         | Telangana |
      | City          | HYD       |
      | Zipcode       |    500000 |
      | Mobile Number | 792795729 |
    And User Click on Create Account button
    Then User Verify that ACCOUNT CREATED! is visible
    And User Click Continue button
    Then User Verify that Logged in as username is visible
    Then User Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible and click Continue button
