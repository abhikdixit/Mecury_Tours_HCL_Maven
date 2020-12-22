package com.mercury.tours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadDataFromExcel_XLS extends ApplicationTestData {
	WebDriver driver;
	 
    @BeforeMethod
    public void LaunchApp() throws Exception {

    	System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
		 driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().window().maximize();
	}

@Test(dataProvider="LoginDataXLS")
public void LoginApp(String uname,String password)throws  Exception{
	
	driver.findElement(By.linkText("SIGN-ON")).click();
	driver.findElement(By.name("userName")).sendKeys(uname);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("login")).click();
	driver.quit();
	}


}
