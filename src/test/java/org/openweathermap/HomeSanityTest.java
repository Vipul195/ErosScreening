package org.openweathermap;

import java.io.IOException;

import org.openweathermap.pages.HomePage;
import org.openweathermap.test.base.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeSanityTest extends BaseTestClass {
	
	private HomePage homePage = null;
	
	
	@Test
	public void verifyHomePageRendering() throws IOException {
		this.homePage = new HomePage(this.driver);
		Assert.assertTrue(this.homePage.isLogoDisplayed());	
		Assert.assertTrue(this.homePage.isSigninDisplayed());
		Assert.assertTrue(this.homePage.isSignupDisplayed());
		Assert.assertTrue(this.homePage.isSupportDisplayed());
		Assert.assertTrue(this.homePage.isCelciusDisplayed());
		Assert.assertTrue(this.homePage.isFarhaniteDisplayed());
		Assert.assertTrue(this.homePage.isCityTxtboxDisplayed());
		Assert.assertTrue(this.homePage.isSearchDisplayed());
		Assert.assertTrue(this.homePage.isWeatherDisplayed());
	}

}
