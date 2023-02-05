package com.page;

import java.io.File;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	 
	public static Properties prop;
	private WebDriver driver;
	public File folder;
	
	public BasePage(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public abstract BasePage waitForPage();
	
}


