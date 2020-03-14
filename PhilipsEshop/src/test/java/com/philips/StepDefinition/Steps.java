package com.philips.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.philips.Utility.java.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends Base {

	  WebDriver driver;
		
	  @Given("^Open the charome and launch the application$")
	  public void Open_the_charome_and_launch_the_application() {
		
    	//personalDetailsPage.enterPersonalDetails(locale);
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//driver//"+"chromedriver.exe");
			
    	driver = new ChromeDriver();    	
    	System.out.println("This Step open the charome and launch the application.");					
    }		

    @When("^Open the application \"(.*)\"$")					
    public void Open_the_application_Url(String url)  							
    {	//driver.get("https://tst.philips.co.uk/shop/");
    	driver.get(url);
       System.out.println("launch the application.");	
       
    }		

    @Then("^Verify the Home page$")					
    public void Verify_the_Home_page()  							
    {    		
        System.out.println("This step click on the Reset button.");					
    }	
    
    @Then("^Verify the title page$")					
    public void Verify_the_title_page() 							
    {    		
        System.out.println("Verify the title page");					
    }	
// Parameterized user value
    
    @Then("^Enter the \"(.*)\" and \"(.*)\"$")
    public void enter_the_username_and_password(String usename, String password)  {
    	
    	driver.findElement(By.xpath("Username")).sendKeys("usename");
    	driver.findElement(By.xpath("Pass")).sendKeys("password");
         }

    @Then("^click the submit button$")
    public void click_the_submit_button()  {
    	driver.close(); 
    }

    
    
    
}
