package com.mercury.tours;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Mobile_Browser_View_Flight_Login {
	ChromeDriver driver;

	@Test
	public void SignOn() {
		driver.get("https://www.shutterfly.com/");
		// driver.get("https://www.shutterfly.com/");
		System.out.println("Navigate to Shutterfly Home page");
	}

	@BeforeTest
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Mecury_Tours_HCL_Maven\\chromedriver.exe");

		ChromeOptions iPhoneOption = new ChromeOptions();

		driver = new ChromeDriver(iPhoneOption);
		Dimension d = new Dimension(640, 960);
		driver.manage().window().maximize();
		driver.manage().window().setSize(d);
		
	}

	@AfterTest
	public void CloseBrowser() {
		driver.quit();
	}

}
