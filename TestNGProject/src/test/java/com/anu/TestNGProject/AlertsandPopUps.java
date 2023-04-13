package com.anu.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertsandPopUps extends Base
{
	@Test
	public void simpleAlert()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMeButton1 = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMeButton1.click();
		driver.switchTo().alert().accept();
	}
	@Test
	public void alertDismiss()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMeButton2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMeButton2.click();
		driver.switchTo().alert().dismiss();
	}
	@Test
	public void enterTextinAlert()
	{
		String Name = "Anu";
		String expectedMessage = "You have entered 'anu' !";
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickforPromtBox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickforPromtBox.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().sendKeys("anu");
		driver.switchTo().alert().accept();
		WebElement textField = driver.findElement(By.xpath("//p[@id='prompt-demo']"));
		String message = textField.getText();
		assertEquals(expectedMessage,message,"message shown is wrong");
		
	}
	@Test
	public void verifyTextofAlertMessage()
	{
		String expectedAlertMessage = "I am a Javascript alert box!";
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMeButton1 = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		boolean clickMeButton1IsEnabled = clickMeButton1.isEnabled();
		assertTrue(clickMeButton1IsEnabled,"Click me button is Disabled");
		clickMeButton1.click();
		String actualAlertMessage = driver.switchTo().alert().getText();
		assertEquals(expectedAlertMessage,actualAlertMessage,"Proper Alert Message is not shown");
	}
}
