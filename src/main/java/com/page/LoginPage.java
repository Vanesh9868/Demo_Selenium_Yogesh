package com.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.utility.TestUtils;

public class LoginPage extends BasePage {

	private WebDriver driver;
	private Logger log = LogManager.getLogger(LoginPage.class);

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement EMAIL;

	@FindBy(xpath = "//input[@id='pass']")
	private WebElement PASSWORD;

	@FindBy(xpath = "//button[@name='login']")
	private WebElement LOGIN_BUTTON;

	@FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	private WebElement CREATE_NEW_ACCOUNT_BUTTON;

	public void enterEmail(String email) {
		log.info("trying to enter email");
		TestUtils.waitForVisibilityOfElement(driver, EMAIL).sendKeys(email);
	}

	public void enterPassword(String password) {
		log.info("trying to enter password");
		TestUtils.waitForVisibilityOfElement(driver, PASSWORD).sendKeys(password);
	}

	public void clickOnLoginButton() {
		log.info("trying to click on login button");
		TestUtils.waitForVisibilityOfElement(driver, LOGIN_BUTTON).click();
	}

	public void clickOnCreatNewAccountButton() {
		log.info("trying to click on login button");
		TestUtils.waitForVisibilityOfElement(driver, CREATE_NEW_ACCOUNT_BUTTON).click();
	}

	@Override
	public BasePage waitForPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
