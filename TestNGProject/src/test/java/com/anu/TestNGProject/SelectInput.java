package com.anu.TestNGProject;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectInput extends Base
{
	@Test
	public void selectInputdemo()
	{
		FindElements findelementsObject = new FindElements(driver);
		findelementsObject.listFindElements("Select Input");
		WebElement selectColor = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectobject = new Select(selectColor);
		selectobject.selectByIndex(2);
		WebElement colorTextField = driver.findElement(By.xpath("//div[@id='message-one']"));
		colorTextField.getText();
		selectobject.selectByVisibleText("Green");
		selectobject.selectByValue("Red");
		List<WebElement> options = selectobject.getOptions();
		int count = options.size();
	}
	@Test
	public void verifytheSelectedColorisGreen()
	{	
		String inputColor1 ="Red";
		String inputColor2 ="Yellow";
		String inputColor3 ="Green";
		FindElements findelementsObject = new FindElements(driver);
		findelementsObject.listFindElements("Select Input");
		WebElement selectColor = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectobject = new Select(selectColor);
		selectobject.selectByIndex(3);
		WebElement selectColorTextField = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualSelectedColor = selectColorTextField.getText();
		String expectedSelectedColor = "Selected Color : "+inputColor3;
		assertEquals(expectedSelectedColor,actualSelectedColor,"Green color is not selected");
		
	}
	@Test
	public void multipleSelection()
	{
		FindElements findelementsObject = new FindElements(driver);
		findelementsObject.listFindElements("Select Input");
		WebElement selectColor = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select selectobject = new Select(selectColor);
		WebElement getAllSelectedButton = driver.findElement(By.xpath("//button[@id='button-all']"));
		boolean isMultipleDropdown = selectobject.isMultiple();
		selectobject.selectByIndex(1);
		selectobject.selectByIndex(2);
		selectobject.deselectAll();
		getAllSelectedButton.click();
	}
	@Test
	public void listofColors_Findelements()
	{
	String inputCategory = "Red";
	FindElements findelementsObject = new FindElements(driver);
	findelementsObject.listFindElements("Select Input");
	List<WebElement> inputColors = driver.findElements(By.xpath("//select[@id='single-input-field']//option"));
	for(WebElement category:inputColors)
	{
		if(category.getAttribute("value").equals(inputCategory))
		{
			category.click();
			break;
		}
	}
	}
	@Test
	public void verifytheSelectedColorisRed()
	{
		String inputColor ="Red";
		FindElements findelementsObject = new FindElements(driver);
		findelementsObject.listFindElements("Select Input");
		WebElement selectColor = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectobject = new Select(selectColor);
		selectobject.selectByValue("Red");
		WebElement selectColorTextField = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualSelectedColor = selectColorTextField.getText();
		String expectedSelectedColor = "Selected Color : "+inputColor;
		assertEquals(expectedSelectedColor,actualSelectedColor,"Green color is not selected");
	}
	@Test
	public void verifytheSelectedColorbyTextisGreen()
	{
		String inputColor ="Green";
		FindElements findelementsObject = new FindElements(driver);
		findelementsObject.listFindElements("Select Input");
		WebElement selectColor = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectobject = new Select(selectColor);
		selectobject.selectByVisibleText("Green");
		WebElement selectColorTextField = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualSelectedColor = selectColorTextField.getText();
		String expectedSelectedColor = "Selected Color : "+inputColor;
		assertEquals(expectedSelectedColor,actualSelectedColor,"Green color is not selected");
		
	}
}
