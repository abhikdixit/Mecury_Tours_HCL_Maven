package com.mercury.tours;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_EditBox_Height_Width {
	@Test
	public void Button_Height_Width()
	
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Mecury_Tours_HCL_Maven\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String ActUserNameHeight=driver.findElement(By.id("btnLogin")).getCssValue("height");
		System.out.println("Height of UserName=" + ActUserNameHeight);
		String ActUserNameWidth=driver.findElement(By.id("btnLogin")).getCssValue("width");
		System.out.println("Width of UserName=" + ActUserNameWidth);
		Assert.assertEquals(ActUserNameHeight, "26px");
		Assert.assertEquals(ActUserNameWidth, "94px");
		driver.quit();
	}
	
}
