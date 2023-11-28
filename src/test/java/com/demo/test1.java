package com.demo;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test1 extends BaseTest {
	@Test
	public void customerlogin() throws AWTException 
	{
	driver.findElement(By.xpath(".//button[text()='Customer Login']")).click();
	driver.findElement(By.id("userSelect")).click();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	driver.findElement(By.xpath(".//button[text()='Login']")).click();
	
	}
	
	

}
