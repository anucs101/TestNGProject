package com.anu.TestNGProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutoIT extends Base
{
	@SuppressWarnings("deprecation")
	@Test
	public void test1() throws IOException
	{
		driver.navigate().to("https://www.ilovepdf.com/word_to_pdf");
		WebElement SelectWordFiles = driver.findElement(By.xpath("//span[text()='Select WORD files']"));
		SelectWordFiles.click();
		Runtime.getRuntime().exec("D:\\AutoITscripts\\pdfconverter1.exe");
		
	}
	@Test
	public void test2()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/jquery-progress-bar.php");
		WebElement startButton = driver.findElement(By.xpath("//button[@id='downloadButton']"));
		startButton.click();
	}

}
