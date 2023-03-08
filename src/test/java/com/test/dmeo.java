package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dmeo {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));    // id
		username.sendKeys("yogesh");

		WebElement password = driver.findElement(By.name("pass"));   // name
		password.sendKeys("123453");

		WebElement loginButton = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));   
		loginButton.click();                                        // xpath with class name
		
		Thread.sleep(5000);
		driver.close();
	}

}
