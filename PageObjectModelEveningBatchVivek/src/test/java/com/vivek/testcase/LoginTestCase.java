package com.vivek.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vivek.testbase.Testbase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase   extends Testbase{

	@BeforeTest//  execute always ONCE before all test  pre condition

@Test // test case	
public void logintest() throws InterruptedException
{
	// enter username
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//  enter password
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//click on login button
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(5000);
actualText=driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/div")).getText();
System.out.println("  Actual Text is --->"+ actualText);
if(actualText.equals(expectedText))
{
	System.out.println(" test case result is Passed");
}else
{
	System.out.println("Test case result is Failed");
}
// report Failure use Assert class method
Assert.assertEquals(actualText, expectedText);
}
	

	
	
	
	
	
	
	
}
