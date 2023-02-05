package com.test;

import org.testng.annotations.Test;
import com.page.HomePage;
import com.page.LoginPage;
import com.utility.BaseClass;

public class loginTest extends BaseClass {

	private LoginPage loginPage;
	private HomePage homePage;

	@Test
	public void VeriFySuccessFullUserLogin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		loginPage.enterEmail("9767068593");
		loginPage.enterPassword("Khiladi@9868");
		loginPage.clickOnLoginButton();
		homePage.VerifyHomeMenuDisplay();
		Thread.sleep(10000);

	}
}
