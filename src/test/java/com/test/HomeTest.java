package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Yogesh Shinde
 * 
 */

import org.testng.annotations.Test;
import com.page.FriendsPage;
import com.page.HomePage;
import com.page.LoginPage;
import com.utility.BaseTest;
import com.utility.TestUtils;

public class HomeTest extends BaseTest {

	public static void verifyNavebar() throws InterruptedException {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		friendsPage = new FriendsPage(driver);
		driver.get("https://www.facebook.com/");
		homePage.VerifyHomeTabDisplay();
		homePage.VerifyFriendsTabDisplay();
		homePage.VerifyWatchTabDisplay();
		homePage.VerifyMarketplaceTabDisplay();
		homePage.VerifyGamingTabDisplay();
	}
	
}
