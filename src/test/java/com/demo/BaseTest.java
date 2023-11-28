package com.demo;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	@Parameters("BrowserName")
	@BeforeClass
	public void OpenBrowser(String BrowserName)
	{
		if(BrowserName.equals("Firefox"))
		{
			  driver = new FirefoxDriver();	
		}
		else if(BrowserName.equals("Chrome"))
		{
			  driver = new ChromeDriver();	
		}
	  
	}
	@BeforeMethod
	public void OpenApp()
	{
		driver.get("\"https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterClass
	public void closeapp()
	{
		driver.close();
	}
	
	

}
