package com.vivek.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	public   WebDriver  driver;
	public static  String actualText, expectedText,url;
	@BeforeTest//  execute ONCE  before all test
	public void  browserOpen()
	{
			url="https://www.saucedemo.com/v1/";
			expectedText="Product";
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);//  Global Dynamic pageloadtimeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Global implicit  wait timeout
		
	}
	
	@AfterTest//execute ONCE after all test	
	public void browserClose()
	{
		driver.quit();//  close the browser
	}
	
}
