package com.anu.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicTable extends Base
{
	@Test
	public void table1()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int size = rows.size();
		List<WebElement> tableHeaders = table.findElements(By.xpath("//tr[@role='row']//th"));
		List<String> rowname = new ArrayList<String>();
		for(WebElement header: tableHeaders ) 
		{
		
			//String s = header.getText();
			rowname.add(header.getText());
		}
		System.out.println(rowname);
	}
	@Test
	public void table2()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		List<WebElement> tableElements = table.findElements(By.xpath("//tr//td"));
		List<String> elementNames = new ArrayList<String>();
		for(WebElement tableElement: tableElements)
		{
			elementNames.add(tableElement.getText());
		}
		System.out.println(elementNames);
	}
	@Test
	public void verifyElementisPresent()
	{
		String expectedElement = "Ashton Cox";
		String actualElement = null;
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		List<WebElement> tableElements = table.findElements(By.xpath("//tr//td"));
		for(WebElement tableElement: tableElements )
		{
			if(tableElement.getText().equals(expectedElement))
			{
				actualElement = tableElement.getText();
				break;
			
			}
			
		}
		assertEquals(expectedElement,actualElement,"element not dtected");
	}
	@Test
	public void verifyAshtonCoxElementisPresent()
	{
	//	verifyElementisPresent("Ashton Cox");
		
	}
	@Test
	public void verifyJuniorTechnicalAuthorElementisPresent()
	{
	//	verifyElementisPresent("Junior Technical Author");
	}
	@Test
	public void verifySanFranciscoElementisPresent()
	{
	//	verifyElementisPresent("San Francisco");
	}
	@Test
	public void verify66ElementisPresent()
	{
	//	verifyElementisPresent("66");
	}
	
	@Test
	public void verify20090112ElementisPresent()
	{
		//verifyElementisPresent("2009/01/12");
	}
	@Test
	public void verify$86000ElementisPresent()
	{
		//verifyElementisPresent("$86,000");
	}
	
	@Test
	public void verifyIfNoMatchingElementFound()
	{
		String searchElement = "Anu";
		String expectedMessage = "No matching records found";
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement TableFilterMenu = driver.findElement(By.xpath("//a[@href='table-filter.php']"));
		TableFilterMenu.click();
		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		WebElement searchBar = driver.findElement(By.xpath("//input[@type='search']"));
		searchBar.sendKeys(searchElement);
		List<WebElement> tableElements = table.findElements(By.xpath("//tbody//td"));
		List<String> tableElementTexts = new ArrayList<String>();
			for(WebElement tableElement:tableElements)
			{
				tableElementTexts.add(tableElement.getText());
			}
		assertTrue(tableElementTexts.contains(expectedMessage),"Could not find the expected Show Message");
		
	}
	@Test
	public void verifyTableFilterCheckWhetherElementisPresentintheRow()
	{
		String searchElement = "Ashton Cox";
		driver.navigate().to("https://selenium.obsqurazone.com/table-pagination.php");
		WebElement TableFilterMenu = driver.findElement(By.xpath("//a[@href='table-filter.php']"));
		TableFilterMenu.click();
		WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
		WebElement searchBar = driver.findElement(By.xpath("//input[@type='search']"));
		searchBar.sendKeys(searchElement);
		List<WebElement> tableElements = table.findElements(By.xpath("//tbody//td"));
		List<String> tableElementTexts = new ArrayList<String>();
			for(WebElement tableElement:tableElements)
			{
				tableElementTexts.add(tableElement.getText());
			}
		assertTrue(tableElementTexts.contains(searchElement),"No matching found");
		
	}
	
	

}
