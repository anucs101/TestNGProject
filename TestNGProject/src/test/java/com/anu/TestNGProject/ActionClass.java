package com.anu.TestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass extends Base

{
	@Test
	public void verifyMovments()
	{
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement textField = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		textField.sendKeys("hello");
		Actions action = new Actions(driver);
		action.moveToElement(showMessageButton).click().perform();
	}
	@Test
	public void mouseHover()
	{
		WebElement simpleInputFormLink = driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
		Actions action = new Actions(driver);
		action.moveToElement(simpleInputFormLink).build().perform();
		
	}
	@Test
	public void doubleClick()
	{
		FindElements findelementObject = new FindElements(driver);
		findelementObject.listFindElements("Checkbox Demo");
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		Actions action=new Actions(driver);
		action.doubleClick(selectAllButton).perform();
	}
	@Test
	public void rightClick()
	{
		FindElements findelementObject = new FindElements(driver);
		findelementObject.listFindElements("Checkbox Demo");
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		Actions action=new Actions(driver);
		action.contextClick(selectAllButton).perform();
	}
	@Test
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
		WebElement source=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		//action.dragAndDrop(source, destination).build().perform();
		action.clickAndHold(source).moveToElement(destination).release(destination).build().perform();
	}
	
	
}
