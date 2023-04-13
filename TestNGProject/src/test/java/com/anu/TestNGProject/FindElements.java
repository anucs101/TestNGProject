package com.anu.TestNGProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindElements extends Base
{
	
	@Test
	public void listFindElements(String inputcategory)
	{
		//String inputcategory = "Form Submit";
		List<WebElement> inputformCategories = driver.findElements(By.xpath("//li[@class='list-group-item']//a"));
		for(WebElement category:inputformCategories)
		{
			if(category.getText().equals(inputcategory))
			{
				category.click();
				break;
			}
			
			
			
		}
	}
	
	public FindElements(WebDriver driver)
	{
		this.driver = driver;
	}
	
}
