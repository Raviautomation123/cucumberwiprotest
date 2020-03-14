@Sanity
Feature: Home page functionality for Eshoop ravindra

Scenario Outline: Verification of Home page  

Given Open the charome and launch the application	
When Open the application "<url>"		
Then Verify the Home page
And Verify the title page
Examples:
|url|
|https://tst.philips.co.uk/shop/|


# without example
#Scenario: Verify the user login   

##When Open the application Url		
#Then Enter the "ravindra" and "Test123"
#Then click the submit button

## with multiple data run the application

#Scenario Outline: Verify the user login   

#Given Open the charome and launch the application	
#When Open the application "<url>"		
#Then Enter the "<username>" and "<password>"
#Then click the submit button


#Examples:
 #|url|                               |username | password |
 #|https://tst.philips.co.uk/shop/|   |ravindra | test123 |
                                      #|testravi  	| test123 |