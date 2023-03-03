package com.test;

import org.testng.annotations.Test;
import com.page.FriendsPage;
import com.page.HomePage;
import com.page.LoginPage;
import com.utility.BaseTest;

public class FindFriendsTest extends BaseTest {

	@Test()
	public void VeriFySuccessFullUserLogin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		friendsPage = new FriendsPage(driver);
		loginPage.loginWithMobileNumber("9767068593", "Khiladi@9868");
		homePage.clickOnFindFriendsOption();
		friendsPage.VerifyFriendsTitleDisplay();
		friendsPage.VerifyHomeFilterDisplay();
		friendsPage.VerifyFriendRequestsFilterDisplay();
		friendsPage.VerifySuggestionsFilterDisplay();
		friendsPage.VerifyAllFriendsFilterDisplay();
		friendsPage.VerifyBirthdaysFilterDisplay();
		friendsPage.VerifyCustomListsFilterDisplay();
	}

}
