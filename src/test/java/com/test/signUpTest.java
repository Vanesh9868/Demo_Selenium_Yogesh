package com.test;

import org.testng.annotations.Test;
import com.page.HomePage;
import com.page.LoginPage;
import com.page.SignUpPage;
import com.utility.BaseClass;

public class signUpTest extends BaseClass {

	private LoginPage loginPage;
	private HomePage homePage;
	private SignUpPage signupPage;

	@Test
	public void VeriFySuccessFullUserLogin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		signupPage = new SignUpPage(driver);
		loginPage.clickOnCreatNewAccountButton();
		Thread.sleep(2000);
		signupPage.enterFirstName("ajay");
		Thread.sleep(2000);
		signupPage.enterLastName("jadhav");
		Thread.sleep(2000);
		signupPage.enterMobileNumberOrEmailAdress("yogeshshinde8830@gmail.com");
		Thread.sleep(2000);
		signupPage.reEnterEmailAdress("yogeshshinde8830@gmail.com");
		Thread.sleep(2000);
		signupPage.enterNewPassword("Ajay@8830");
		Thread.sleep(2000);
		signupPage.selectDay("12");
		Thread.sleep(2000);
		signupPage.selectMonth("Jun");
		Thread.sleep(2000);
		signupPage.selectYear("2005");
		Thread.sleep(2000);
		signupPage.selectMaleGenderRadioButton();
		Thread.sleep(2000);
		signupPage.clickOnSignupButton();
		Thread.sleep(2000);

	}
}
