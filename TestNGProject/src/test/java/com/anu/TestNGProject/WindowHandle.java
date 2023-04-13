package com.anu.TestNGProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WindowHandle extends Base

{
	@Test
	public void verifyRegistration()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		WebElement clickHereLink = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHereLink.click();
		String MainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();		
		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
                    driver.switchTo().window(ChildWindow);
                    WebElement emailIDTextField = driver.findElement(By.xpath("//input[@type='text']"));
                    WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
                    emailIDTextField.sendKeys("abc@gmail.com");
                    submitButton.click();
                    driver.close();
                    
            }
        }
        driver.switchTo().window(MainWindow);
         
	}
	@Test
	public void verifylikeUsonFacebookButtonPopUp()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Follow @obsqurazone on Facebook']")));
		WebElement likeUsOnFacebookButton = driver.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		wait.until(ExpectedConditions.elementToBeClickable(likeUsOnFacebookButton));
		likeUsOnFacebookButton.click();
		String MainWindow = driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();	
		 while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            { 
	            	driver.switchTo().window(ChildWindow);
	            	driver.manage().window().maximize();
	            	WebElement emailID = driver.findElement(By.xpath("//input[@name='email']"));
	            	WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	            	WebElement loginButton = driver.findElement(By.xpath("//div[@aria-label='Accessible login button']"));
	            	emailID.sendKeys("abc@gmail.com");
	            	password.sendKeys("abcdefght#");
	            	loginButton.click();
	            }
	         }
	
	}

}
