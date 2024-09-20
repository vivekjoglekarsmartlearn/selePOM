package com.vivek.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.vivek.testbase.Testbase;
public class LoginPage   extends  Testbase{//  step 1 create  Constrcutor of  currrent class to intilize all objects elements 	
	public WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;    }
//  Step 2 create Object Repostiry OR page Factory OR web Element UI
	By  usernameEditbox=By.id("user-name");	By  passwordEditbox=By.id("password");
	By  Loginbtn=By.id("login-button");	By productText=By.xpath("//*[@id=\"inventory_filter_container\"]/div");
// Step 3 create each  action cross.  method
	public void enterUsername(String username)
	{		driver.findElement(usernameEditbox).sendKeys(username);
	}
	public void enterPasswor(String password)
	{
		driver.findElement(passwordEditbox).sendKeys(password);
	}	public void clickOnLoginButton()
	{
		driver.findElement(Loginbtn).click();
	}	
	public void verifyText()
	{
actualText=		driver.findElement(productText).getText();
System.out.println("  Actual Text is --->"+ actualText);
if(actualText.equals(expectedText))
{
	System.out.println(" test case result is Passed");
}else
{
	System.out.println("Test case result is Failed");
}// report Failure use Assert class method
Assert.assertEquals(actualText, expectedText);
	}
	public String getTitle()
	{
String actualTitle=		driver.getTitle();
System.out.println("  axctual page Title is --->"+actualTitle);
return actualTitle;
	}
	
	
	
	
	
}
