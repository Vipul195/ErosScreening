package org.openweathermap.test.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * 
 * @author Vipul Jain
 * this class is designed to provide common functionality to the tests.
 * like setting up the driver and passing it to subsequent tests.
 *
 */

public class BaseTestClass {
	
	public WebDriver driver = null;
	
	@BeforeTest
	public void setupDriver() {
		
		
		/**
		 * needs to setup chrome driver path from the test.setup.properties file.
		 */
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\com\\weatherMap\\thirdPartyDriver\\chromedriver.exe");
		 ChromeOptions  option = new ChromeOptions();
			option.addArguments("--disable-notifications");	
		this.driver = new ChromeDriver(option);
		
		/**
		 * neede to set the application url from the properties file
		 */
		
		this.driver.get("https://openweathermap.org/");
		this.driver.manage().window().maximize();
		
		/**
		 * Its always good to avoid the implicit wait so need to create a wait mechanism in Master page to 
		 * Apply explicit wait.
		 */
		this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void destroyDriver() {
		this.driver.quit();
	}

}
