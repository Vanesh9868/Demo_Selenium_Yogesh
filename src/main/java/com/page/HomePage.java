package com.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.utility.TestUtils;

public class HomePage extends BasePage {

	private WebDriver driver;
	private Logger log = LogManager.getLogger(HomePage.class);

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='x1n2onr6'])[1]")
	private WebElement HOME_MENU;

	public void VerifyHomeMenuDisplay() {
		log.info("trying to get Home menu");
		boolean HomeMenudisplay = TestUtils.waitForVisibilityOfElement(driver, HOME_MENU).isDisplayed();
		Assert.assertEquals(HomeMenudisplay, true);
	}

	@Override
	public BasePage waitForPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
