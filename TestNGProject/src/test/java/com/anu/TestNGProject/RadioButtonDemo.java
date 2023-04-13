package com.anu.TestNGProject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RadioButtonDemo extends Base
{
	@Test
	public void radiobuttondemo()
	{
		
		FindElements findelementsObject = new FindElements(driver);
		findelementsObject.listFindElements("Radio Buttons Demo");//navigate to radio button demo page
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='inlineRadio2']")));
		WebElement femaleradioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean status =femaleradioButton.isSelected();
		femaleradioButton.click();
		boolean isRadioButtonSelected =	femaleradioButton.isSelected();
		
	}
	@Test
	public void verifybothMaleandFemalebuttonisEnabledAndSelectFemaleRadioButton()
	{
		FindElements findelementsObject = new FindElements(driver);
		findelementsObject.listFindElements("Radio Buttons Demo");
		String expectedTextofshowSelectedValueButton = "Radio button 'Female' is checked";
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean femaleRadioButtonisSelected = femaleRadioButton.isSelected();
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean maleRadioButtonisSelected = maleRadioButton.isSelected();
		assertFalse(femaleRadioButtonisSelected&&maleRadioButtonisSelected,"both or any one of the radio buttons is selected");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(femaleRadioButton));
		femaleRadioButton.click();
		boolean femaleRadioButtonisclicked = femaleRadioButton.isSelected();
		assertTrue(femaleRadioButtonisclicked,"female button is not selected");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='button-one']")));
		WebElement showSelectedValueButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean showSelectedValueButtonIsEnabled = showSelectedValueButton.isEnabled();
		assertTrue(showSelectedValueButtonIsEnabled,"Show selected value Button is disabled");
		showSelectedValueButton.click();
		WebElement showSelectedValueButtonTextField = driver.findElement(By.xpath("//div[@id='message-one']"));
		wait.until(ExpectedConditions.textToBePresentInElement(showSelectedValueButtonTextField, "Radio button 'Female' is checked"));
		String actualTextofshowSelectedValueButton = showSelectedValueButtonTextField.getText();
		assertEquals(expectedTextofshowSelectedValueButton,actualTextofshowSelectedValueButton,"Text after clicking show selected value button is not same as per the input value");
		
	}
	@Test
	public void verifybothMaleandFemalebuttonisEnabledAndSelectmaleRadioButton()
	{
		FindElements findelementsObject = new FindElements(driver);
		findelementsObject.listFindElements("Radio Buttons Demo");
		String expectedTextofshowSelectedValueButton = "Radio button 'Male' is checked";
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean femaleRadioButtonisSelected = femaleRadioButton.isSelected();
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean maleRadioButtonisSelected = maleRadioButton.isSelected();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementSelectionStateToBe(maleRadioButton, maleRadioButtonisSelected));
		assertFalse(femaleRadioButtonisSelected&&maleRadioButtonisSelected,"both or any one of the radio buttons is selected");
		maleRadioButton.click();
		boolean maleRadioButtonisClicked = maleRadioButton.isSelected();
		assertTrue(maleRadioButtonisClicked,"male button is not selected");
		WebElement showSelectedValueButton = driver.findElement(By.xpath("//button[@id='button-one']"));
		boolean showSelectedValueButtonIsEnabled = showSelectedValueButton.isEnabled();
		assertTrue(showSelectedValueButtonIsEnabled,"Show selected value Button is disabled");
		showSelectedValueButton.click();
		WebElement showSelectedValueButtonTextField = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualTextofshowSelectedValueButton = showSelectedValueButtonTextField.getText();
		assertEquals(expectedTextofshowSelectedValueButton,actualTextofshowSelectedValueButton,"Text after clicking show selected value button is not same as per the input value");
		
	}
	@Test
	public void VerifygroupRadioButtonsDemoAndCheckPatientsGenderandAgeGroup()
	{
		
		FindElements findelementsObject = new FindElements(driver);
		findelementsObject.listFindElements("Radio Buttons Demo");
		String gender1 = "Male";
		String gender2 = "Female";
		String ageGroup1 = "1 to 18";
		String ageGroup2 = "19 to 44";
		String ageGroup3 = "45 to 60";
		String expectedResults = "Gender : "+gender1+"\n"+"Age group: "+ageGroup2;
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		boolean maleRadioButtonisSelected = maleRadioButton.isSelected();
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		boolean femaleRadioButtonisSelected = femaleRadioButton.isSelected();
		assertFalse(femaleRadioButtonisSelected&&maleRadioButtonisSelected,"both or any one of the radio buttons is selected");
		maleRadioButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeSelected(maleRadioButton));
		boolean maleRadioButtonisClicked = maleRadioButton.isSelected();
		assertTrue(maleRadioButtonisClicked,"Male radio button is not selected");
		WebElement ageGroup1to18RadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		boolean ageGroup1to18RadioButtonIsSelected = ageGroup1to18RadioButton.isSelected();
		WebElement ageGroup19to44RadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
		boolean ageGroup19to44RadioButtonIsSelected = ageGroup19to44RadioButton.isSelected();
		WebElement ageGroup45to60RadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		boolean ageGroup45to60RadioButtonIsSelected = ageGroup45to60RadioButton.isSelected();
		assertFalse(ageGroup1to18RadioButtonIsSelected&&ageGroup19to44RadioButtonIsSelected&&ageGroup45to60RadioButtonIsSelected,"Age group is already selected in application");
		ageGroup19to44RadioButton.click();
		boolean ageGroup19to44RadioButtonIsClicked = ageGroup19to44RadioButton.isSelected();
		assertTrue(ageGroup19to44RadioButtonIsClicked,"Age group 1to19 is not selected");
		WebElement getRessultsButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		boolean getRessultsButtonIsEnabled = getRessultsButton.isEnabled();
		assertTrue(getRessultsButtonIsEnabled,"Get results button is disabled");
		getRessultsButton.click();
		WebElement getResultstextField = driver.findElement(By.xpath("//div[@id='message-two']"));
		String actualResults = getResultstextField.getText();
		assertEquals(expectedResults,actualResults,"not getting expected results according patient gender and age group");

	}

}
