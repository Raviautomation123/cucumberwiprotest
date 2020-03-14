package com.philips.TestRunner;		


import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
	
@RunWith(Cucumber.class)	

@CucumberOptions(features="src/test/resources/Features",glue={"com.philips.StepDefinition"},tags= {"@Sanity"},
plugin ={"pretty","html:reports/output-report","json:target/reports/output-report.json","junit:target/reports/output-report.xml"},
dryRun = false,
monochrome=true)



/*@RunWith(Cucumber.class)    
@CucumberOptions 
(features = "src/test/resources/Features",
plugin ={"pretty","html:reports/test-report","junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports"},
tags= {"@Sanity"})
*/
/*@CucumberOptions(features = "src/test/resources/features", glue = {
		"com/philips/StepDefinitions" }, plugin = { "pretty", "html:target/cucumber-reports",
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports" },
		monochrome = true,strict = true)*/

/*@CucumberOptions(
		features = "src/test/resources/features", 
		glue = {"src/test/java/StepDefinition/step"}, 
		plugin = {"pretty","html:target/site/htmlReport","json:target/reports/cucumber-ShoppingTestWebFeature-report.json"},
		monochrome = true ,
        tags = {"@sanity"})
*/



public class Runner 				
{		
       @BeforeClass
	public static void beforeclass() {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		System.setProperty("Currentdate",dateformat.format(new Date()));
		//Seleniumutil.cleanFolder("Logs");  // delete the all  log file
	}
       
       @AfterClass
   	public static void Afterclass() {
   		/*if(SeleniumUtil.getDriver()!= null) {
   			SeleniumUtil.closeBrowser();
   			SeleniumUtil.setDriver(null);
   			SeleniumUtil.driverstatus=false;
   		}
   	*/}
}

