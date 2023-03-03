package com.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.utility.TestUtils;

public class FriendsPage extends BasePage {

	private WebDriver driver;
	private Logger log = LogManager.getLogger(FriendsPage.class);

	public FriendsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='xwoyzhm x1rhet7l']//span//h1[text()='Friends']")
	private WebElement FRIENDS_TITLE;

	@FindBy(xpath = "//div[@class='xu06os2 x1ok221b']//span[text()='Home']")
	private WebElement HOME_FILTER;

	@FindBy(xpath = "//span[text()='Friend requests']")
	private WebElement FRIEND_REQUESTS_FILTER;

	@FindBy(xpath = "//div[@class='xu06os2 x1ok221b']//span[text()='Suggestions']")
	private WebElement SUGGESTIONS_FILTER;

	@FindBy(xpath = "//div[@class='xu06os2 x1ok221b']//span[text()='All Friends']")
	private WebElement ALL_FRIENDS_FILTER;

	@FindBy(xpath = "//div[@class='xu06os2 x1ok221b']//span[text()='Birthdays']")
	private WebElement BIRTHDAYS_FILTER;

	@FindBy(xpath = "//div[@class='xu06os2 x1ok221b']//span[text()='Custom lists']")
	private WebElement CUSTOM_LISTS_FILTER;

	public void VerifyFriendsTitleDisplay() throws InterruptedException {
		log.info("trying to get friends title");
		Thread.sleep(2000);
		boolean FriendsTitledisplay = TestUtils.waitForVisibilityOfElement(driver, FRIENDS_TITLE).isDisplayed();
		Assert.assertEquals(FriendsTitledisplay, true);
	}

	public void VerifyHomeFilterDisplay() {
		log.info("trying to get Home filter");
		boolean HomeFilterDisplay = TestUtils.waitForVisibilityOfElement(driver, HOME_FILTER).isDisplayed();
		Assert.assertEquals(HomeFilterDisplay, true);
	}

	public void VerifyFriendRequestsFilterDisplay() {
		log.info("trying to get friend request filter");
		boolean FriendRequestsFilterDisplay = TestUtils.waitForVisibilityOfElement(driver, FRIEND_REQUESTS_FILTER)
				.isDisplayed();
		Assert.assertEquals(FriendRequestsFilterDisplay, true);
	}

	public void VerifySuggestionsFilterDisplay() {
		log.info("trying to get Suggestions filter");
		boolean SuggestionsFilterDisplay = TestUtils.waitForVisibilityOfElement(driver, SUGGESTIONS_FILTER)
				.isDisplayed();
		Assert.assertEquals(SuggestionsFilterDisplay, true);
	}

	public void VerifyAllFriendsFilterDisplay() {
		log.info("trying to get All Friends Filter");
		boolean AllFriendsFilterDisplay = TestUtils.waitForVisibilityOfElement(driver, ALL_FRIENDS_FILTER)
				.isDisplayed();
		Assert.assertEquals(AllFriendsFilterDisplay, true);
	}

	public void VerifyBirthdaysFilterDisplay() {
		log.info("trying to get Birthdays Filter");
		boolean BirthdaysFilterDisplay = TestUtils.waitForVisibilityOfElement(driver, BIRTHDAYS_FILTER).isDisplayed();
		Assert.assertEquals(BirthdaysFilterDisplay, true);
	}

	public void VerifyCustomListsFilterDisplay() {
		log.info("trying to get Custom Lists Filter");
		boolean CustomListsFilterDisplay = TestUtils.waitForVisibilityOfElement(driver, CUSTOM_LISTS_FILTER)
				.isDisplayed();
		Assert.assertEquals(CustomListsFilterDisplay, true);
	}

}
