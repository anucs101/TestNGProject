package com.anu.TestNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Base 
{
	public WebDriver driver;
	@BeforeMethod
	public  void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\git\\TestNGProject\\TestNGProject\\src\\main\\java\\Resources\\chromedriver.exe");//driver initialization
		//if the browser is edge key will be - webdriver.edge.driver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void afterTest()
	{
		driver.quit();
	}
	

}
