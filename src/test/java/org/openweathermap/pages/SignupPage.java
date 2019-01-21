package org.openweathermap.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openweathermap.pages.master.MasterPage;

public class SignupPage extends MasterPage {

	public SignupPage(WebDriver driver) throws IOException {
		super(driver, "homepagelocators");
		this.driver = driver;
	}
	
	public Boolean clickSignup()
	{
		this.click("SignUp_Lnk");
		return true;
	}
	public Boolean doSignup(String uName, String email, String pass, String repPass)
	{
		//username
		sendKeys("Username_Txtbox", uName);
		//email
		sendKeys("Email_Txtbox", email);
		//Password
		sendKeys("Pass_Txtbox", pass);
		//Repeat_Password
		sendKeys("Pass_Txtbox", pass);
		//click Age Confirmation
		click("Age_Confirm");
		//Click Policy Confirmation
		click("Policy_Confirm");
	/*	//Click Captcha Confirmation
		click("Captcha_Confirm"); //Commenting as captcha is picture based
		//Click Create Account btn
		click("Create_Btn");*/
		return true;
	}
}
