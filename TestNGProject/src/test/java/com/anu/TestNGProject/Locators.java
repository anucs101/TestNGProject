package com.anu.TestNGProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base
{
	@Test
	public void locatorById()
	{
		driver.findElement(By.id("twotabsearchtextbox"));
		driver.findElement(By.id("nav-hamburger-menu"));
		driver.findElements(By.id("nav-logo-sprites"));
		driver.findElements(By.id("swm-link"));//some  error shown
		driver.findElements(By.id("searchDropdownBox"));
		driver.findElements(By.id("nav-search-submit-button"));
		driver.navigate().to("https://www.amazon.com/s?k=gaming+keyboard&pd_rd_r=4136bf4e-53e7-4310-a440-2871b912365d&pd_rd_w=OgsdX&pd_rd_wg=Q7mdO&pf_rd_p=12129333-2117-4490-9c17-6d31baf0582a&pf_rd_r=78P8XW4XQNZHKW1X0TT5&ref=pd_gw_unk");
		driver.findElements(By.id("a-autoid-0-announce"));
		driver.findElements(By.id("departments"));
		driver.findElements(By.id("climatePledgeFriendlyRefinements"));
		driver.findElements(By.id("low-price"));
		driver.findElements(By.id("high-price"));
		
	}
	@Test
	public void locatorByName()
	{
		driver.findElement(By.name("glow-validation-token"));
		driver.findElement(By.name("dropdown-selection"));
		driver.findElement(By.name("dropdown-selection-ubb"));
		driver.findElement(By.name("ue_backdetect"));
	}
	@Test
	public void locatorByClass()
	{
		driver.findElement(By.className("layoutToolbarPadding"));
		driver.findElement(By.className("icp-nav-link-inner"));
		driver.findElement(By.className("nav-progressive-attribute"));
		driver.findElement(By.className("skip-link"));
		driver.findElement(By.className("nav-search-facade"));
		driver.findElement(By.className("nav-logo-locale"));
	}
	@Test
	public void locatorBylinkText()
	{
		driver.findElement(By.linkText("Customer Service"));
		driver.findElement(By.linkText("Amazon miniTV"));
		driver.findElement(By.linkText("Best Sellers"));
		driver.findElement(By.linkText("Mobiles"));
		driver.findElement(By.linkText("Baby Products"));
		driver.findElement(By.linkText("Electronics"));
		
	}
	@Test
	public void locatorBypartialLinkText()
	{
		driver.findElement(By.partialLinkText("Today's"));
		driver.findElement(By.partialLinkText("Releases"));
		driver.findElement(By.partialLinkText("Movers"));
		driver.findElement(By.partialLinkText("Most Wished"));
		driver.findElement(By.partialLinkText("Gifted"));
		driver.findElement(By.partialLinkText("More"));
	}
	@Test
	public void locatorByTagName()
	{
		driver.findElement(By.tagName("a"));
		driver.findElement(By.tagName("span"));
		driver.findElement(By.tagName("div"));
		
	}
	@Test
	public void locatorByCssSelector()
	{
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));//tag and id
		driver.findElement(By.cssSelector("a.skip-link")); //tag and class
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));//tag,attribute,value
		driver.findElement(By.cssSelector("input.nav-progressive-attribute[id=unifiedLocation1ClickAddress]"));//tag,class,attribute,value
		driver.findElement(By.cssSelector("div#navbar"));
		driver.findElement(By.cssSelector("div#nav-logo"));
		driver.findElement(By.cssSelector("div.a-carousel-viewport"));
		driver.findElement(By.cssSelector("div.nav-progressive-content"));
		driver.findElement(By.cssSelector("div[id=desktop-grid-2]"));
		driver.findElement(By.cssSelector("a[href='/b?node=28264243031']"));
		driver.findElement(By.cssSelector("div.nav-progressive-content[id=nav-global-location-toaster-script-container]"));
		driver.findElement(By.cssSelector("label.nav-progressive-attribute[for=searchDropdownBox]"));
		
		
	}
	@Test
	public void locatorByXpath()
	{
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		driver.findElement(By.xpath("//div[text()='EN']"));
		driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']"));
		driver.findElement(By.xpath("//div[@class='nav-left']"));
		driver.findElement(By.xpath("//div[@aria-hidden='true']"));
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
		driver.findElement(By.xpath("//header[@id='navbar-main']"));
		driver.findElement(By.xpath("//img[@alt='Helmets']"));
		driver.findElement(By.xpath("//a[@href='/minitv?ref_=nav_avod_desktop_topnav']"));
		driver.findElement(By.xpath("//span[@style='visibility: visible;']"));
		driver.findElement(By.xpath("//span[@aria-hidden='true']"));
		
		
	}
	

}
