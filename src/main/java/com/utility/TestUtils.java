package com.utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

public class TestUtils {
	
	public static ExtentTest test;

	public static WebElement waitForVisibilityOfElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}

	public static WebElement waitForElementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	public static void switchToChildWindow(WebDriver driver, String parentId) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String childId = it.next();

			if (!parentId.equalsIgnoreCase(childId)) {
				driver.switchTo().window(childId);
			}
		}

	}

}
