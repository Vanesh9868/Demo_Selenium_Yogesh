package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.page.HomePage;
import com.page.LoginPage;
import com.utility.BaseTest;

public class LoginTest extends BaseTest {

	private static LoginPage loginPage;
	private static HomePage homePage;

	public static void VeriFySuccessFullUserLogin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		driver.get("https://www.facebook.com/");
		loginPage.loginWithMobileNumber("9767068593", "Khiladi@9868");
		homePage.VerifyHomeTabDisplay();
	}
	


}
