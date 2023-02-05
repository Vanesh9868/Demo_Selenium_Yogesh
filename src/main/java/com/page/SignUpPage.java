package com.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.utility.TestUtils;

public class SignUpPage extends BasePage {

	private WebDriver driver;
	private Logger log = LogManager.getLogger(SignUpPage.class);

	public SignUpPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement FIRST_NAME;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement LAST_NAME;

	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement MOBILE_NO_OR_EMAIL_ADRESS;

	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	private WebElement RE_ENTER_EMAIL_ADRESS;

	@FindBy(xpath = "//input[@id='password_step_input']")
	private WebElement NEW_PASSWORD;

	@FindBy(xpath = "//select[@id='day']")
	private WebElement DAY;

	@FindBy(xpath = "//select[@id='month']")
	private WebElement MONTH;

	@FindBy(xpath = "//select[@id='year']")
	private WebElement YEAR;

	@FindBy(xpath = "(//label[@class='_58mt'])[1]")
	private WebElement FEMALE_GENDER_RADIO_BUTTON;

	@FindBy(xpath = "(//label[@class='_58mt'])[2]")
	private WebElement MALE_GENDER_RADIO_BUTTON;

	@FindBy(xpath = "(//label[@class='_58mt'])[3]")
	private WebElement CUSTOM_GENDER_RADIO_BUTTON;

	@FindBy(xpath = "//button[@name='websubmit']")
	private WebElement SIGNUP_BUTTON;

	public void enterFirstName(String firstName) {
		log.info("trying to enter first name");
		TestUtils.waitForVisibilityOfElement(driver, FIRST_NAME).sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		log.info("trying to enter last name");
		TestUtils.waitForVisibilityOfElement(driver, LAST_NAME).sendKeys(lastName);
	}

	public void enterMobileNumberOrEmailAdress(String mobileNumberOrEmail) {
		log.info("trying to enter mobile number or email adress");
		TestUtils.waitForVisibilityOfElement(driver, MOBILE_NO_OR_EMAIL_ADRESS).sendKeys(mobileNumberOrEmail);
	}

	public void reEnterEmailAdress(String reEnterEamilAdress) {
		log.info("trying to re enter email adress");
		TestUtils.waitForVisibilityOfElement(driver, RE_ENTER_EMAIL_ADRESS).sendKeys(reEnterEamilAdress);
	}

	public void enterNewPassword(String newPassword) {
		log.info("trying to enter new password");
		TestUtils.waitForVisibilityOfElement(driver, NEW_PASSWORD).sendKeys(newPassword);
	}

	public void selectDay(String Day) {
		log.info("trying to select day");
		TestUtils.waitForVisibilityOfElement(driver, DAY);
		Select day = new Select(DAY);
		day.selectByVisibleText(Day);
	}

	public void selectMonth(String Month) {
		log.info("trying to select month");
		TestUtils.waitForVisibilityOfElement(driver, MONTH);
		Select month = new Select(MONTH);
		month.selectByVisibleText(Month);
	}

	public void selectYear(String Year) {
		log.info("trying to select year");
		TestUtils.waitForVisibilityOfElement(driver, YEAR);
		Select year = new Select(YEAR);
		year.selectByVisibleText(Year);
	}

	public void selectFemaleGenderRadioButton() {
		log.info("trying to click on female gender radio button");
		TestUtils.waitForVisibilityOfElement(driver, FEMALE_GENDER_RADIO_BUTTON).click();
	}

	public void selectMaleGenderRadioButton() {
		log.info("trying to click on male gender radio button");
		TestUtils.waitForVisibilityOfElement(driver, MALE_GENDER_RADIO_BUTTON).click();
	}

	public void selectCustomGenderRadioButton() {
		log.info("trying to click on custom gender radio button");
		TestUtils.waitForVisibilityOfElement(driver, CUSTOM_GENDER_RADIO_BUTTON).click();
	}

	public void clickOnSignupButton() {
		log.info("trying to click on signup button");
		TestUtils.waitForVisibilityOfElement(driver, SIGNUP_BUTTON).click();
	}

	@Override
	public BasePage waitForPage() {
		// TODO Auto-generated method stub
		return null;
	}

}
