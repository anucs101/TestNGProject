package com.anu.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBoxDemo extends Base
{
	@Test
	public void checkboxdemo()

	{
		FindElements findelementsObject = new FindElements(driver);
		findelementsObject.listFindElements("Checkbox Demo");
		String expectedsuccessCheckBoxText = "Success - Check box is checked";
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox.click();
		WebElement successCheckBoxText = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualsuccessCheckBoxText = successCheckBoxText.getText();
		assertEquals(expectedsuccessCheckBoxText,actualsuccessCheckBoxText,"Check box is not succesfully checked ");
	}
	@Test
	public void multipleCheckBoxDemo() 
	{
		FindElements findelementsObject = new FindElements(driver);
		findelementsObject.listFindElements("Checkbox Demo");
		String expectedAttributeValueofUnSelectAllButton = "Unselect All";
		WebElement checkBoxOne = driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean checkBoxOneIsSelected = checkBoxOne.isSelected();
		WebElement checkBoxTwo = driver.findElement(By.xpath("//input[@id='check-box-two']"));
		boolean checkBoxTwoIsSelected = checkBoxTwo.isSelected();
		WebElement checkBoxThree = driver.findElement(By.xpath("//input[@id='check-box-three']"));
		boolean checkBoxThreeIsSelected = checkBoxThree.isSelected();
		WebElement checkBoxFour = driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean checkBoxFourIsSelected = checkBoxFour.isSelected();
		assertFalse(checkBoxOneIsSelected&&checkBoxTwoIsSelected&&checkBoxThreeIsSelected&&checkBoxFourIsSelected,"Some of the checkboxes are already selected");
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@id='button-two']"));
		boolean selectAllButtonIsEnabled = selectAllButton.isEnabled();
		assertTrue(selectAllButtonIsEnabled,"Select all Button is not enables");
		selectAllButton.click();
		boolean checkBoxOneIsClicked = checkBoxOne.isSelected();
		boolean checkBoxTwoIsClicked = checkBoxTwo.isSelected();
		boolean checkBoxThreeIsClicked = checkBoxThree.isSelected();
		boolean checkBoxFourIsClicked = checkBoxFour.isSelected();
		assertTrue(checkBoxOneIsClicked&&checkBoxTwoIsClicked&&checkBoxThreeIsClicked&&checkBoxFourIsClicked,"All check boxes are not Selected after clicking select all button");
		String AttributeValueofUnSelectAllButton = selectAllButton.getAttribute("value");
		assertEquals(expectedAttributeValueofUnSelectAllButton,AttributeValueofUnSelectAllButton,"Unselect All is not enabled");
		
	}
}
