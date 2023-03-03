package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.page.HomePage;
import com.page.LoginPage;
import com.utility.BaseTest;

public class LoginTest extends BaseTest {

	private LoginPage loginPage;
	private HomePage homePage;

	@Test
	public void VeriFySuccessFullUserLogin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		loginPage.loginWithMobileNumber("9767068593", "Khiladi@9868");
		homePage.VerifyHomeTabDisplay();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
