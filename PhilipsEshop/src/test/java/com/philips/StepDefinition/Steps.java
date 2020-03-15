package com.philips.StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.philips.Utility.java.Base;

import cucumber.api.DataTable;
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
/*// Parameterized user value
    
    @Then("^Enter the \"(.*)\" and \"(.*)\"$")
    public void enter_the_username_and_password(String usename, String password)  {
    	
    	driver.findElement(By.xpath("Username")).sendKeys("usename");
    	driver.findElement(By.xpath("Pass")).sendKeys("password");
         }
*/

    ////////  data driven  approch
    
// Parameterized user value  login senaros
    
  /*  @Then("^Enter the usename and password $")
    public void enter_the_username_and_password(DataTable credencials)  {
    	
    	List<List<String>> data = credencials.raw();
    	
    	driver.findElement(By.xpath("Username")).sendKeys(data.get(0).get(0));
    	
    	driver.findElement(By.xpath("Pass")).sendKeys(data.get(0).get(1));
         }
    
    
    @Then("^Then eneter the registration details $")
    public void Then_eneter_the_registration_details(DataTable register)  {
    	
    	List<List<String>> data = register.raw();
    	
    	driver.findElement(By.xpath("Fname")).sendKeys(data.get(0).get(0));    	
    	driver.findElement(By.xpath("Lname")).sendKeys(data.get(0).get(1));    	
    	driver.findElement(By.xpath("Email")).sendKeys(data.get(0).get(2));
    	driver.findElement(By.xpath("MobileNo")).sendKeys(data.get(0).get(3));
         }
    
  */  
    
    
    
    
    
    @Then("^click the submit button$")
    public void click_the_submit_button()  {
    	driver.close(); 
    }

    
    
    
}
