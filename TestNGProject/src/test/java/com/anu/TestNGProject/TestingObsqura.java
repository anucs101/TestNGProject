package com.anu.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class TestingObsqura extends Base

{
	@Test
	public void testingTwoInputField()
	{
		int	valueA = 10;
		int valueB = 20;
		int finalValue = valueA+valueB;	
		String expectedTotalValue = "Total A + B : "+finalValue;
		WebElement valueAtextbox = driver.findElement(By.xpath("//input[@id='value-a']"));
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		WebElement foo=fluentWait.until(ExpectedConditions.visibilityOf(valueAtextbox));
		boolean isValueAtextBoxDisplayed = valueAtextbox.isDisplayed();
		assertTrue(isValueAtextBoxDisplayed,"Value A Text box is not displayed");
		valueAtextbox.sendKeys(Integer.toString(valueA));
		WebElement valueBtextbox = driver.findElement(By.xpath("//input[@id='value-b']"));
		boolean isValueBtextBoxDisplayed = valueBtextbox.isDisplayed();
		assertTrue(isValueBtextBoxDisplayed,"Value B Text box is not displayed");
		valueBtextbox.sendKeys(Integer.toString(valueB));
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean isgetTotalButtonEnabled   = getTotalButton.isEnabled();
		assertTrue(isgetTotalButtonEnabled,"Get Total Button is not enabled");
		getTotalButton.click();
		WebElement totalValueTextfield = driver.findElement(By.xpath("//div[@id='message-two']"));
		String actualTotalValue = totalValueTextfield.getText();
		assertEquals(expectedTotalValue, actualTotalValue,"Calculated final value is wrong");
		
	

				
	

}
				
}
