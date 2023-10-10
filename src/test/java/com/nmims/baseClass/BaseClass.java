package com.nmims.baseClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.ReadConfig;

public class BaseClass {
	ReadConfig readConfig = new ReadConfig();

	public String baseURL = readConfig.getApplicationURL();
	public String userName = readConfig.getUsername();
	public String password = readConfig.getPassword();
	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	public void setup(@Optional("chrome") String br) {

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.getChrome());

			// Add arguments to enable the "clear-browser-data" command-line switch
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions"); // Disable extensions

			options.addArguments("--disable-web-security");
			options.addArguments("--ignore-certificate-errors");
			//options.addArguments("--headless");
			
			
			driver = new ChromeDriver(options);

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);

		driver.manage().window().maximize();
	}

	/*
	 * public void captureScreen(WebDriver driver, String tname) throws IOException
	 * {
	 * 
	 * TakesScreenshot ts=(TakesScreenshot) driver; File source
	 * =ts.getScreenshotAs(OutputType.FILE); File target=new
	 * File(System.getProperty("user.dir") + "/Screenshots/" + tname +".png" );
	 * FileUtils.copyFile(source, target);
	 * 
	 * System.out.println("Screenshot taken");
	 * 
	 * }
	 */

	
	  @AfterClass public void tearDown() 
	  {
	  
	  driver.quit(); 
	  }
	 
}
