package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import com.page.HomePage;
import com.page.LoginPage;
import com.page.SignUpPage;
import com.utility.BaseTest;

public class TestRunner extends BaseTest {

	private SignUpPage signupPage;

	@Test()
	public void login() throws InterruptedException {
		LoginTest.VeriFySuccessFullUserLogin();
	}

	@Test(dependsOnMethods="login")
	public void verifyNavebar() throws InterruptedException {
		HomeTest.verifyNavebar();
	}

	@Test(dependsOnMethods="login")
	public void FindFriendsTest() throws InterruptedException {
		FindFriendsTest.verifyFriendstest();
	}

}
