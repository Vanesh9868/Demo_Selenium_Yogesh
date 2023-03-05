package com.test;

import org.testng.annotations.Test;
import com.page.FriendsPage;
import com.page.HomePage;
import com.page.LoginPage;
import com.utility.BaseTest;

public class HomeTest extends BaseTest {

	@Test()
	public void VeriFySuccessFullUserLogin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		friendsPage = new FriendsPage(driver);
		loginPage.loginWithMobileNumber("9767068593", "Khiladi@9868");
		homePage.VerifyHomeTabDisplay();
		homePage.VerifyFriendsTabDisplay();
		homePage.VerifyWatchTabDisplay();
		homePage.VerifyMarketplaceTabDisplay();
		homePage.VerifyGamingTabDisplay();
	}
	
}
