package org.openweathermap.pages.master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MasterPage {

	public WebDriver driver = null;
	public Properties prop = null;
	
	public MasterPage(WebDriver driver,  String propFilePath ) throws IOException {
		this.driver = driver;
		

		FileInputStream ip = new FileInputStream("F:\\Java Class\\Eros-ScreeningTest\\ErosScreening\\src\\test\\resources\\home.locators.properties");
		this.prop = new Properties();
		this.prop.load(ip);
		
	}
	
	/**
	 * 
	 * @param xpathKeys
	 * @param userData
	 * Place to write common methods in order to interact with web elements.
	 */
	
	public void sendKeys(String xpathKeys, String userData)
	{
		this.driver.findElement(By.xpath(this.prop.getProperty(xpathKeys))).sendKeys(userData);
	}
	public boolean elementDisplayed(String xpathkeys)
	{
		return this.driver.findElement(By.xpath(this.prop.getProperty(xpathkeys))).isDisplayed();
	}
	public void click(String xpathkeys)
	{
		this.driver.findElement(By.xpath(this.prop.getProperty(xpathkeys))).click();
	}
	public void getText(String xpathkeys)
	{
		this.driver.findElement(By.xpath(this.prop.getProperty(xpathkeys))).getText();
	}
	
}
