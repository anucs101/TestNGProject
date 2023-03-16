package com.anu.TestNGProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LocatorsbydifferntCommands extends Base
{
	@Test
	public void locateById()
	{
		driver.findElement(By.id("twotabsearchtextbox"));
	}
	@Test
	public void locateByCssSelector1()
	{
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
	}
	@Test
	public void locateByCssSelector2()
	{
		driver.findElement(By.cssSelector("input[aria-label='Search Amazon.in']"));
	}
	@Test
	public void locateByXpath()
	{
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
	}
	

}
