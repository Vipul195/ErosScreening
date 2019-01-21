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
		super(driver, "homepagelocators");
		this.driver = driver;
	}
	
	
	public  boolean isLogoDisplayed() {
		return  this.elementDisplayed("WebsiteLogo_img");
	}
	public  boolean isSigninDisplayed() {
		return  this.elementDisplayed("SignIn_Lnk");
	}
	public  boolean isSignupDisplayed() {
		return  this.elementDisplayed("SignUp_Lnk");
	}
	public  boolean isSupportDisplayed() {
		return  this.elementDisplayed("Support_Lnk");
	}
	public  boolean isCelciusDisplayed() {
		return  this.elementDisplayed("Temp_Celcius_Btn");
	}
	public  boolean isFarhaniteDisplayed() {
		return  this.elementDisplayed("Temp_Farhanite_Btn");
	}
	public  boolean isCityTxtboxDisplayed() {
		return  this.elementDisplayed("Enter_City_Txtbox");
	}
	public  boolean isSearchDisplayed() {
		return  this.elementDisplayed("Search_Btn");
	}
	public  boolean isWeatherDisplayed() {
		return  this.elementDisplayed("Weather_Details");
	}
	public Boolean enterCity(String cityName)
	{
		//cityname
		sendKeys("Enter_City_Txtbox", cityName);
		// Click Search Button
		click("Search_Btn");
		return true;
	}
	
	
}
