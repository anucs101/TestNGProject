package com.anu.TestNGProject;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class BrowserCommands extends Base

{	@Test
	public void getTitleCommands()
	{
	String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";			
	String actualtitle = driver.getTitle();
	assertEquals(expectedTitle,actualtitle,"titles are not equal");
	
	}
}
