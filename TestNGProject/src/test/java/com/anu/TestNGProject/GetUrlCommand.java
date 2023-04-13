package com.anu.TestNGProject;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GetUrlCommand extends Base

{
	@Test
	public void getUrlCommand()
	{
		String url = driver.getCurrentUrl();
		String actualUrl = "https://www.amazon.in/";
		assertEquals(actualUrl,url,"urls are not same");
	}

}
