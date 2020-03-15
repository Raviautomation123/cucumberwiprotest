package com.philips.StepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.philips.Utility.java.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dataStep {

	  WebDriver driver;
		
	  @Given("^Open the charome and launch the applications$")
	  public void Open_the_charome_and_launch_the_application() {
		
    	//personalDetailsPage.enterPersonalDetails(locale);
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//driver//"+"chromedriver.exe");
			
    	driver = new ChromeDriver();    	
    	System.out.println("This Step open the charome and launch the application.");					
    }		

    @When("^Open the application \"(.*)\"$")					
    public void Open_the_application_Urls(String url)  							
    {	//driver.get("https://tst.philips.co.uk/shop/");
    	driver.get(url);
       System.out.println("launch the application.");	
       
    }		

   /* @Then("^Verify the Home page$")					
    public void Verify_the_Home_page()  							
    {    		
        System.out.println("This step click on the Reset button.");					
    }	
    
    @Then("^Verify the title page$")					
    public void Verify_the_title_page() 							
    {    		
        System.out.println("Verify the title page");					
    }	*/
// Parameterized user value
  /*  
    @Then("^Enter the \"(.*)\" and \"(.*)\"$")
    public void enter_the_username_and_password(String usename, String password)  {
    	
    	driver.findElement(By.xpath("Username")).sendKeys("usename");
    	driver.findElement(By.xpath("Pass")).sendKeys("password");
         }
*/

    ////////  data driven  approch
    
// Parameterized user value  login senaros
    
  /*@Then("^eneter login the username and password $")
    public void enter_the_username_and_password(DataTable credentials)  {
    	
	  List<List<String>> data = credentials.raw();
	  	
	  	driver.findElement(By.xpath("Username")).sendKeys(data.get(0).get(0));
	  	
	  	driver.findElement(By.xpath("Pass")).sendKeys(data.get(0).get(1));

  }
*/  //////////  list data only one data without header
    /*
    @Then("^Then eneter the registration details $")
    public void Then_eneter_the_registration_details(DataTable register)  {
    	
    	List<List<String>> data = register.raw();
    	
    	driver.findElement(By.xpath("Fname")).sendKeys(data.get(0).get(0));    	
    	driver.findElement(By.xpath("Lname")).sendKeys(data.get(0).get(1));    	
    	driver.findElement(By.xpath("Email")).sendKeys(data.get(0).get(2));
    	driver.findElement(By.xpath("MobileNo")).sendKeys(data.get(0).get(3));
         }
    
  */
    
  //////////  map of the data
  
  @Then("^eneter login username and password $")
  public void eneter_login_username_and_password(DataTable credentials)  {
	  
	  for(Map<String,String>data :credentials.asMaps(String.class,String.class))
    	{
    	
    	driver.findElement(By.xpath("Username")).sendKeys(data.get("username"));
    	
    	driver.findElement(By.xpath("Pass")).sendKeys(data.get("password"));
         }

  	       }

  
  @Then("^Then eneter the registration details $")
  public void Then_eneter_the_registration_details(DataTable register)  {
  	
	  for(Map<String,String>data :register.asMaps(String.class,String.class))
	  {
  	driver.findElement(By.xpath("Fname")).sendKeys(data.get("name"));    	
  	driver.findElement(By.xpath("Lname")).sendKeys(data.get("Lastname"));    	
  	driver.findElement(By.xpath("Email")).sendKeys(data.get("emailid"));
  	driver.findElement(By.xpath("MobileNo")).sendKeys(data.get("MobileNo"));
       }
  }

  
  
  @Then("^click the submit button$")
    public void click_the_submit_button()  {
    	driver.close(); 
    }

    
    
    
}
