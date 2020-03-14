package com.philips.Utility.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class Base {
	
	public static WebDriver driver;
	protected static Properties properties;
	  
	public static void initilizeDriver(String browser) throws Exception{
		
		if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//driver//"+"chromedriver.exe");
			
			System.out.println("launching chrome browser");
		
			
			//For jenkins need to use chrome option and argument
			ChromeOptions options = new ChromeOptions();
		//	options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,UnexpectedAlertBehaviour.IGNORE); 
			options.addArguments("enable-automation");
			//options.addArguments("--headless");
			options.addArguments("--window-size=1920,1080");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-extensions");
			options.addArguments("--dns-prefetch-disable");
			options.addArguments("--disable-gpu");
		//	options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver=new ChromeDriver(options);
			
			//driver = new ChromeDriver(options);

		}  if(browser.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"//driver//"+"geckodriver.exe");
			driver=new FirefoxDriver();
		} 
		
		 if (browser.equalsIgnoreCase("InternetExplorer")){
			 driver=new InternetExplorerDriver();
			//WebDriverManager.iedriver().setup();
			driver = new EdgeDriver();
		}
		
	}
	
	@BeforeTest(alwaysRun=true)
	public void startUp() throws Exception{
		
		initilizeDriver("chrome");
		getURL();
		setWaitAndWindowMaximize();
		
	/*	// firefox
		initilizeDriver("firefox");
		getURL();
		setWaitAndWindowMaximize();
		
		// edge
		initilizeDriver("Edge");
		getURL();
		setWaitAndWindowMaximize();
	*/	
	}
	
	public void getURL() {
		String URL = loadPropertiesFile("login.properties", "URL");
		System.out.println("URL Value is " + URL);
		driver.get(URL);
	}

	public static String loadPropertiesFile(String FileName, String Key) {
		String URL_Value = "";
		File file = new File(System.getProperty("user.dir")
				+ "//src//main//resources//Config_Data_Provider//" + FileName);
		try {
			FileInputStream fis = new FileInputStream(file);
			properties = new Properties();
			properties.load(fis);
			URL_Value = properties.getProperty(Key);
		} catch (Exception e) {

			System.out.println("Exception message is " + e.getMessage());
		}

		return URL_Value;
	}
	public void setWaitAndWindowMaximize() {
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void takeScreenShot() throws IOException {
	
		  TakesScreenshot ts = ((TakesScreenshot)driver);
	         File source = ts.getScreenshotAs(OutputType.FILE);
	       String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());
	 //  File dest = new File("C:\\Users\\ra40049981\\eclipse-workspace\\Com.Philips\\Screenshot\\Ecom.png" + filename);
	         
	       File dest = new File(System.getProperty("user.dir")
					      + "Screenshot\\Ecom.png" + filename);
	   //    Com.Philips\Com.Philips\Screenshot
	         FileUtils.copyFile(source, dest);
	  //     FileUtils.copyFile (source,new File("./Screenshot/test.png"));
	              
        
	}
	
	@AfterTest(alwaysRun=true)
	public void tearDown() {
	//	driver.close();
	//	driver.quit();
	}

	
	    
	   
}
