package org.openweathermap;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
		AssertJUnit.assertTrue(this.homePage.isLogoDisplayed());	
	}

}
