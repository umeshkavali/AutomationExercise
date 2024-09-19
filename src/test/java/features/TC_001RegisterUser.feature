Feature: Create a New User

  Scenario Outline: User Account Creation
    Given User launch the browser
    Then User navigates to the URL "https://automationexercise.com/"
    And User verify the home page is visible successfully
    Then User clicks on SignUp or Login button
    And User Verify New User Signup! is visible
    Then User should enter the name as "uagugugdu" and emailId as "kjbvalvbd@mailinator.com"
    And User Click on Signup button
    Then User Verify that ENTER ACCOUNT INFORMATION is visible
    Then User should fill the below account and address information details
      | fieldName                                                | value           |
      | Title                                                    | <title>         |
      | Password                                                 | <password>      |
      | Date of Birth                                            | <date of birth> |
      | First name                                               | <first name>    |
      | Last name                                                | <last name>     |
      | Company                                                  | <company>       |
      | Address * (Street address, P.O. Box, Company name, etc.) | <address>       |
      | Address 2                                                | <address2>      |
      | Country                                                  | <country>       |
      | State                                                    | <state>         |
      | City                                                     | <city>          |
      | Zipcode                                                  | <zipcode>       |
      | Mobile Number                                            | <mobile number> |
    And User Select Sign up for our newsletter! checkbox
    And User Select Receive special offers from our partners! checkbox
    And User Click on Create Account button
    Then User Verify that ACCOUNT CREATED! is visible
    And User Click Continue button
    Then User Verify that Logged in as username is visible
    Then User Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible and click Continue button

    Examples: 
      | title | password  | date of birth | first name | last name | company | address | address2 | country | state     | city      | zipcode | mobile number |
      | Mr.   | Umesh@062 | 21 July 1993  | Umesh      | Kavali    | iLensys | HYD     | HYD2     | India   | Telangana | Hyderabad |  500032 |      86386583 |
