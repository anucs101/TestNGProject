package com.anu.TestNGProject;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetNavigateCommands extends Base

{
	//@Test
	public void navigateCommands()
	{	String expectedUrl = "https://www.flipkart.com/";
		String expectedUrl2 = "https://www.amazon.in/";
		driver.navigate().to("https://www.flipkart.com/");
		String actualUrl = driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl,"urls is not same");
		driver.navigate().back();
		String url2 = driver.getCurrentUrl();
		assertEquals(expectedUrl2,url2,"urls is not same");
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	@Test
	public void softAssertCommand()
	{	String expectedUrl = "https://www.flipkart.com/com";
		String expectedUrl2 = "https://www.amazon.in/";
		SoftAssert softAssert = new SoftAssert();
		driver.navigate().to("https://www.flipkart.com/");
		String actualUrl = driver.getCurrentUrl();
		softAssert.assertEquals(expectedUrl,actualUrl,"urls is not same");
		driver.navigate().back();
		String url2 = driver.getCurrentUrl();
		softAssert.assertEquals(expectedUrl2,url2,"urls is not same");
		driver.navigate().forward();
		driver.navigate().refresh();
		softAssert.assertAll();
	}

}
