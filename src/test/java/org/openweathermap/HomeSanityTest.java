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
	}

}
