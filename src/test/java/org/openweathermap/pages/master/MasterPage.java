package org.openweathermap.pages.master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MasterPage {

	protected WebDriver driver = null;
	protected Properties prop = null;
	
	public MasterPage(WebDriver driver,  String propFilePath ) throws IOException {
		this.driver = driver;
		

		FileInputStream ip = new FileInputStream("F:\\Java Class\\workspace\\OpenWeatherMap\\src\\com\\weatherMap\\OR\\Locators.properties");
		this.prop = new Properties();
		this.prop.load(ip);
		
	}
	
	/**
	 * 
	 * @param xpathKeys
	 * @param userData
	 * Place to write common methods in order to interact with web elements.
	 */
	
	protected void sendKeys(String xpathKeys, String userData)
	{
		this.driver.findElement(By.xpath(this.prop.getProperty(xpathKeys))).sendKeys(userData);
	}
	
	
	protected boolean elementDisplayed(String xpathkeys)
	{
		return this.driver.findElement(By.xpath(this.prop.getProperty(xpathkeys))).isDisplayed();
	}
	
	protected void click(String xpathkeys)
	{
		this.driver.findElement(By.xpath(this.prop.getProperty(xpathkeys))).click();
	}
	
}
