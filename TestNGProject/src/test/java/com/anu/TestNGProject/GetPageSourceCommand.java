package com.anu.TestNGProject;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class GetPageSourceCommand extends Base

{
	@Test
	public void getpageSourceCommand()
	{
	String pageSource =	driver.getPageSource();
	String actualPageSource = "<!-- sp:feature:csm:head-open-part1 -->";
	assertTrue(pageSource.contains(actualPageSource),"Page sources are same");
	}

}
