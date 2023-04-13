package com.anu.TestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecuter extends Base

{
	
	@Test
	public void clickShowmessageButton()
	{
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement textField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		textField.sendKeys("hello");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showMessageButton);
	}
	@Test
	public void EnterValueInTextField()
	{
		String input = "'Hello'";
		WebElement singleInputTextField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value="+input+";", singleInputTextField);
		
	}

}
