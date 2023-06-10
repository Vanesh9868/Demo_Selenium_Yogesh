package com.test;

import org.testng.annotations.Test;
import com.utility.BaseTest;

public class TestRunner extends BaseTest {

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
