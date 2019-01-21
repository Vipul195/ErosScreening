package org.openweathermap;

import java.io.IOException;

import org.openweathermap.pages.SignupPage;
import org.openweathermap.test.base.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTestClass {
	
	private SignupPage signupPage = null;
	
	@Test
	public void verifySignupPage() throws IOException {
		this.signupPage = new SignupPage(this.driver);
		
		Assert.assertTrue(this.signupPage.clickSignup());
		Assert.assertTrue(this.signupPage.doSignup("vipul8590","abc@xyz.com","12345678", "12345678"));
	}
}
