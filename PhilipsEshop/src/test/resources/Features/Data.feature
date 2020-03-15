@sanity
Feature: login data functionality for Eshoop

  Scenario: Verification of login data on login page
  	Given Open the charome and launch the applications
    When Open the application Url
    Then eneter login the username and password
    |username|password|
    |ravindra| test123|
     |ravi| test123|
      |ravikumar| test123|
    
    Then click the login button
    Then eneter the registration details
        |Name  |Lastname |emailid |Mobileno|
        |Fname|Lname|email@wipro.com|Mobileno|
        |Fname|Lname|email@wipro.com|Mobileno|
         |Fname|Lname|email@wipro.com|Mobileno|
          |Fname|Lname|email@wipro.com|Mobileno|
        
    Then close the browser