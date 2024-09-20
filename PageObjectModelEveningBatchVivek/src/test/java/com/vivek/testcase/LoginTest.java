package com.vivek.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vivek.testbase.Testbase;

public class LoginTest extends Testbase {
LoginPage  lp;
	@Test(priority=1)
public void TC001_LoginTest()
{
	lp=new LoginPage(driver);
	//enter username 
	lp.enterUsername("standard_user");
	//enter password
	lp.enterPasswor("secret_sauce");
	//click on login button
	lp.clickOnLoginButton();
	//verifyText
	lp.verifyText();
//	actualText=driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/div")).getText();
}

	@Test(priority=2)
public void TC002_Logininvalid()
{
	lp=new LoginPage(driver);
	//enter username 
	lp.enterUsername("standard_user");
	//enter password
	lp.enterPasswor("secret_saucea");
	//click on login button
	lp.clickOnLoginButton();
	//verifyText
Assert.assertEquals(lp.getTitle(),"test title"," title is miss match");
//	actualText=driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/div")).getText();
}
	
	
	
}
