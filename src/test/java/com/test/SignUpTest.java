package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.page.HomePage;
import com.page.LoginPage;
import com.page.SignUpPage;
import com.utility.BaseTest;

public class SignUpTest extends BaseTest {

	private LoginPage loginPage;
	private SignUpPage signupPage;

	@Test
	public void VeriFySuccessFullUserLogin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		signupPage = new SignUpPage(driver);
		loginPage.clickOnCreatNewAccountButton();
		signupPage.enterFirstName("ajay");
		signupPage.enterLastName("jadhav");
		signupPage.enterMobileNumberOrEmailAdress("yogeshshinde8830@gmail.com");
		signupPage.reEnterEmailAdress("yogeshshinde8830@gmail.com");
		signupPage.enterNewPassword("Ajay@8830");
		signupPage.selectDay("12");
		signupPage.selectMonth("Jun");
		signupPage.selectYear("2005");
		signupPage.selectMaleGenderRadioButton();
		signupPage.clickOnSignupButton();
		signupPage.enterOtp("12345");
		signupPage.clickOnContinueButton();
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
}
