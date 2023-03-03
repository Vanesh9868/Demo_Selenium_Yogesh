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
	private WebElement HOME_TAB;

	@FindBy(xpath = "//span[contains(text(),'Friends')]")
	private WebElement FIND_FRIENDS;

	@FindBy(xpath = "//a[@aria-label='Friends']//span[@class='x1n2onr6']")
	private WebElement FRIENDS_TAB;

	@FindBy(xpath = "//a[@aria-label='Watch']//span[@class='x1n2onr6']")
	private WebElement WATCH_TAB;

	@FindBy(xpath = "//a[@aria-label='Marketplace']//span[@class='x1n2onr6']")
	private WebElement MARKETPLACE_TAB;

	@FindBy(xpath = "//a[@aria-label='Gaming']//span[@class='x1n2onr6']")
	private WebElement GAMING_TAB;

	public void VerifyHomeTabDisplay() {
		log.info("trying to get Home tab");
		boolean HomeTabdisplay = TestUtils.waitForVisibilityOfElement(driver, HOME_TAB).isDisplayed();
		Assert.assertEquals(HomeTabdisplay, true);
	}

	public void clickOnFindFriendsOption() {
		log.info("trying to click on find friends option");
		TestUtils.waitForElementToBeClickable(driver, FIND_FRIENDS).click();
	}

	public void VerifyFriendsTabDisplay() {
		log.info("trying to get friends tab");
		boolean FriendsTabdisplay = TestUtils.waitForVisibilityOfElement(driver, FRIENDS_TAB).isDisplayed();
		Assert.assertEquals(FriendsTabdisplay, true);
	}

	public void VerifyWatchTabDisplay() {
		log.info("trying to get Watch tab");
		boolean WatchTabdisplay = TestUtils.waitForVisibilityOfElement(driver, WATCH_TAB).isDisplayed();
		Assert.assertEquals(WatchTabdisplay, true);
	}

	public void VerifyMarketplaceTabDisplay() {
		log.info("trying to get marketplace tab");
		boolean MarketplaceTabdisplay = TestUtils.waitForVisibilityOfElement(driver, MARKETPLACE_TAB).isDisplayed();
		Assert.assertEquals(MarketplaceTabdisplay, true);
	}

	public void VerifyGamingTabDisplay() {
		log.info("trying to get gaming tab");
		boolean GamingTabdisplay = TestUtils.waitForVisibilityOfElement(driver, GAMING_TAB).isDisplayed();
		Assert.assertEquals(GamingTabdisplay, true);
	}

}
