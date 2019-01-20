package org.openweathermap.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openweathermap.pages.master.MasterPage;

public class HomePage extends MasterPage {
	
/**
 * 
 * @param driver
 * @throws IOException
 * Please set the file locator properties file path correctly here
 * And use the setup file to do that .
 */
	public HomePage(WebDriver driver) throws IOException {
		super(driver, "\\path to corresponding page locators properties file\\");
		this.driver = driver;
	}
	
	
	public  boolean isLogoDisplayed() {
		return  this.elementDisplayed("WebsiteLogo_img");
	}
	
	
}
