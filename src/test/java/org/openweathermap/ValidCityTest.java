package org.openweathermap;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openweathermap.pages.HomePage;
import org.openweathermap.test.base.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidCityTest extends BaseTestClass{

private HomePage homePage = null;
	
	
	@Test
	public void validCityName() throws IOException {
		this.homePage = new HomePage(this.driver);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement search = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Your city name']")));
		Assert.assertTrue(search.isDisplayed());
		this.homePage.enterCity("Agra");
		List<WebElement> company = driver.findElements(By.xpath("//*[@id='forecast_list_ul']/table/tbody/tr/td[2]"));
		if(company.size()>0)
		{
			driver.findElement(By.xpath("//*[@id='forecast_list_ul']/table/tbody/tr[1]/td[2]/b[1]/a")).click();
		}
		Assert.assertTrue(this.homePage.isWeatherDisplayed());
	}
}
