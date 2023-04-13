package com.anu.TestNGProject;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.testng.annotations.Test;

public class TestNGAssertions extends Base

{	@Test
	public void assertCommands()
	{	String expectedUrl1 = "https://www.flipkart.com/";
		//String veryfyNull = null;
		String expectedPageSource = "<script type='text/javascript'>var ue_t0=ue_t0||+new Date();</script>";
		driver.navigate().to("https://www.myntra.com/");
		String actualUrl1 = driver.getCurrentUrl();
		assertNotEquals(expectedUrl1, actualUrl1,"not navigated myntra");
		String actualPageSource = driver.getPageSource();
		assertFalse(actualPageSource.contains(expectedPageSource));
		String verifynotNull = driver.getTitle();
		assertNotNull(verifynotNull);
		int veryfyNull = TestNGAssertions.subsrting_rec(actualPageSource, expectedPageSource);
		assertNull(veryfyNull);
		
	}

	static int subsrting_rec(String str, String sub)
	{
    if (str.contains(sub)){
       return 1 + subsrting_rec(str.replaceFirst(sub, ""), sub);
    }
    return 0;
 }
	

}
