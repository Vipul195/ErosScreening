package org.openweathermap;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openweathermap.pages.HomePage;
import org.openweathermap.test.base.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidCityTest extends BaseTestClass{
	
private HomePage homePage = null;
	
	
	@Test
	public void invalidCityName() throws IOException {
		this.homePage = new HomePage(this.driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Your city name']")));
		Assert.assertTrue(this.homePage.enterCity("ABC"));
		String s1 = driver.findElement(By.xpath("//div[@class='alert alert-warning']")).getText();
		if(s1.equalsIgnoreCase("Not Found"))
		{
			Assert.assertTrue(true, "City Not Found");
		}
		//Assert.assertFalse(this.homePage.isWeatherDisplayed());
	}

}
