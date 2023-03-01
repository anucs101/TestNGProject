package com.anu.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommands extends Base
{
	@Test
	public void sendKeys()
	{
		WebElement searchbar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbar.sendKeys("phones");
	}
	@Test
	public void sendkeysOfobsqura()
	{	
		String inputMessage = "hello";
		String expectedMessage = "Your Message : "+inputMessage;
		WebElement message = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys(inputMessage);
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessageButton.click();
		WebElement yourMessage = driver.findElement(By.cssSelector("div#message-one"));
		String yourMessageText = yourMessage.getText();
		assertEquals(expectedMessage, yourMessageText,"Message is not same");
		
		
	}
	@Test
	public void getTextfromShowmessagebutton()
	{
		String expectedText = "Show Message";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String showMessagetext = showMessageButton.getText();
		assertEquals(expectedText, showMessagetext,"button text is not show message");
		
	}
	@Test
	public void getTextfromSingleinputfield()
	{
		String expectedText = "Single Input Field";
		WebElement singleInputfieldText = driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
		String actualText = singleInputfieldText.getText();
		assertEquals(expectedText, actualText,"Single input field text is not as expected");
	}
	@Test
	public void webelementmethods()
	{
		String inputMessage = "hello";
		WebElement singleInputfieldTextbox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		boolean isSingleinputfieldTextboxDisplayed=singleInputfieldTextbox.isDisplayed();
		assertTrue(isSingleinputfieldTextboxDisplayed,"Single input field text Box not displayed");
		singleInputfieldTextbox.sendKeys(inputMessage);
		singleInputfieldTextbox.clear();
		String singleInputfieldtagName=singleInputfieldTextbox.getTagName();
		String classValue = singleInputfieldTextbox.getAttribute("class");
		String typeValue = singleInputfieldTextbox.getAttribute("type");
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String backGroundColor = showMessageButton.getCssValue("background-color");
		Point locationshowMessagebutton =showMessageButton.getLocation();
		int showMessageButtonX = locationshowMessagebutton.getX();
		int showMessageButtonY = locationshowMessagebutton.getY();
		Dimension sizeofShowMessagebutton = showMessageButton.getSize();
		int height = sizeofShowMessagebutton.getHeight();
		int width = sizeofShowMessagebutton.getWidth();
		List<WebElement> inputformCategories = driver.findElements(By.xpath("//li[@class='list-group-item']"));
	}
	@Test
	public void verifyFontColorOfShowmessagebutton()
	{
		String expectedFontColor = "rgba(255, 255, 255, 1)";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String fontColor = showMessageButton.getCssValue("color");
		assertEquals(expectedFontColor,fontColor,"font color is different from expected value");
	}
	@Test
	public void verifyFontSizeofShowmessagebutton()
	{
		String expectedFontSize = "16px";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualFontSize = showMessageButton.getCssValue("font-size");
		assertEquals(expectedFontSize,actualFontSize,"font size is not as expected");
	}
	@Test
	public void verifyShapeofShowmessagebutton()
	{	
		String expectedShape = "4px";
		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		String actualShape = showMessageButton.getCssValue("border-radius");
		assertEquals(expectedShape,actualShape,"Shape of show button is not oval");
	}
	@Test
	 public void verifyBackgroundColorOfGetTotalbutton()
	 {
		String expectedBackgroundColor = "rgba(0, 123, 255, 1)";
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		String actualbackgroundColor = getTotalButton.getCssValue("background-color");
		assertEquals(expectedBackgroundColor,actualbackgroundColor,"Background color is not blue");
	 }
	@Test
	public void verifyAllignmentofgetTotalbuttonandValueBTextBox()
	{
		WebElement getTotalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		Point getTotalButtonLocation = getTotalButton.getLocation();
		int getTotalButtonLocationX = getTotalButtonLocation.getX();
		int getTotalButtonLocationY = getTotalButtonLocation.getY();
		WebElement valueBtextbox = driver.findElement(By.xpath("//input[@id='value-b']"));
		Point valueBtextboxLocation = valueBtextbox.getLocation();
		int valueBtextboxLocationX = valueBtextboxLocation.getX();
		int valueBtextboxLocationY = valueBtextboxLocation.getY();
		boolean isgettotalbuttonAllignedaftertextBoxB = (getTotalButtonLocationY>valueBtextboxLocationY);
		assertTrue(isgettotalbuttonAllignedaftertextBoxB,"GetTotal button is alligned before textBox B");
	}
	@Test
	public void countoflistInputformCategories()
	{
		List<WebElement> inputformCategories = driver.findElements(By.xpath("//li[@class='list-group-item']"));
		int countofinputformCategories = inputformCategories.size();
	}
	

}
