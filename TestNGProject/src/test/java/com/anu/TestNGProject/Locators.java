package com.anu.TestNGProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators extends Base
{
	@Test
	public void locatorById()
	{
		driver.navigate().to("https://www.amazon.in/");
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
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.name("glow-validation-token"));
		driver.findElement(By.name("dropdown-selection"));
		driver.findElement(By.name("dropdown-selection-ubb"));
		driver.findElement(By.name("ue_backdetect"));
	}
	@Test
	public void locatorByClass()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.className("layoutToolbarPadding"));//
		driver.findElement(By.className("icp-nav-link-inner"));
		driver.findElement(By.className("nav-progressive-attribute"));
		driver.findElement(By.className("skip-link"));
		driver.findElement(By.className("nav-search-facade"));
		driver.findElement(By.className("nav-logo-locale"));
	}
	@Test
	public void locatorBylinkText()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.linkText("Customer Service"));
		driver.findElement(By.linkText("Amazon miniTV"));
		driver.findElement(By.linkText("Best Sellers"));
		driver.findElement(By.linkText("Mobiles"));
		driver.findElement(By.linkText("Electronics"));
		
	}
//	@Test
	public void locatorBypartialLinkText()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.partialLinkText("Today's"));
		driver.findElement(By.partialLinkText("Releases"));
	//	driver.findElement(By.partialLinkText("Most Wished"));
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
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.cssSelector("input#twotabsearchtextbox"));//tag and id
		driver.findElement(By.cssSelector("a.skip-link")); //tag and class
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]"));//tag,attribute,value
		driver.findElement(By.cssSelector("input.nav-progressive-attribute[id=unifiedLocation1ClickAddress]"));//tag,class,attribute,value
		driver.findElement(By.cssSelector("div#navbar"));
		driver.findElement(By.cssSelector("div#nav-logo"));
		driver.findElement(By.cssSelector("div.a-carousel-viewport"));
		driver.findElement(By.cssSelector("div.nav-progressive-content"));
		driver.findElement(By.cssSelector("div[id=desktop-grid-2]"));
		driver.findElement(By.cssSelector("div.nav-progressive-content[id=nav-global-location-toaster-script-container]"));
		driver.findElement(By.cssSelector("label.nav-progressive-attribute[for=searchDropdownBox]"));
		
		
	}
	@Test
	public void locatorByXpath()
	{
		driver.navigate().to("https://www.amazon.in/");
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
	@Test
	public void locatorByXpathContains()
	{
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//div[contains(@class,'col-lg-3')]"));
		driver.findElement(By.xpath("//nav[contains(@class,'navbar-expand')]"));
		driver.findElement(By.xpath("//div[contains(@class,'page')]"));
		driver.findElement(By.xpath("//div[contains(@class,'logo')]"));
		driver.findElement(By.xpath("//div[contains(@id,'one')]"));
		
		
	}
	@Test
	public void locatorByAbsoluteXpath() 
	{
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button"));
		
		
		
		
	}
	@Test
	public void locatorByXpathUsingOR()
	{
		driver.findElement(By.xpath("//a[@href='check-box-demo.php' or text()='Checkbox Demo']"));
		driver.findElement(By.xpath("//label[@for='inputEmail4' or text()='Enter Message']"));
		driver.findElement(By.xpath("//button[@id='button-one' or text()='Show Message']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//button[@id='button-one' or text()='Show Selected Value']"));
		driver.findElement(By.xpath("//label[@for='inlineRadio24' or text()='45 to 60']"));
	}
	@Test
	public void locatorByXpathUsingAnd()
	{
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button' ]"));
		driver.findElement(By.xpath("//div[@id='message-two' and @class='my-2' ]"));
		driver.findElement(By.xpath("//a[@class='nav-link' and @id='alert-modal' ]"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//input[@name='inlineRadioOptions' and @id='inlineRadio1']"));
		driver.findElement(By.xpath("//label[@for='inlineRadio11' and text()='Male']"));
	}
	@Test
	public void locatorByXpathStartsWith()
	{
		driver.findElement(By.xpath("//a[starts-with(text(),'Checkbox')]"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//label[starts-with(text(),'19')]"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Get')]"));
		driver.findElement(By.xpath("//a[starts-with(text(),'Radio')]"));
	}
	@Test
	public void locatorByXpathUsingParentAttribute()
	{
		driver.findElement(By.xpath("//label[@for='inputEmail4']//parent::div[@class='form-group']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//option[@value='Red']//parent::select[@id='single-input-field']"));
		driver.findElement(By.xpath("//div[@id='message-one']//parent::form[@method='POST']"));
		driver.findElement(By.xpath("//button[@id='button-first']//parent::form[@method='POST']"));
	}
	@Test
	public void locatorByXpathUsingChildAttribute()
	{
		driver.findElement(By.xpath("//div[@class='card']//child::div[contains(text(),'Menu')]"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='example my-3']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//div[@class='card-body']//child::h4[text()='Pateints Gender']"));
		driver.navigate().to("https://selenium.obsqurazone.com/select-input.php");
		driver.findElement(By.xpath("//div[@class='header-top']//child::div[@class='container']"));
		driver.findElement(By.xpath("//div[contains(@class,'top-logo')]//child::a[@href='index.php']"));
		
		
		
	}
	@Test
	public void locatorByXpathUsingFollowing()
	{
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='example my-3']"));
		driver.findElement(By.xpath("//div[contains(text(),'Single')]//following::div[@id='message-two']"));
		driver.findElement(By.xpath("//div[contains(text(),'Single')]//following::div[@class='card']"));
		driver.findElement(By.xpath("//form[@method='POST']//following::button[@id='button-two']"));
		driver.findElement(By.xpath("//form[@method='POST']//following::footer[@class='mt-5']"));
	}
	@Test
	public void locatorByXpathUsingAncestor()
	{
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::form[@method='POST']"));
		driver.findElement(By.xpath("//div[contains(text(),'Menu')]//ancestor::div[@class='card']"));
		driver.findElement(By.xpath("//div[contains(text(),'Menu')]//ancestor::div[@class='row']"));
		driver.findElement(By.xpath("//div[contains(text(),'Two Input')]//ancestor::div[@class='example my-3']"));
		driver.findElement(By.xpath("//div[@class='container']//ancestor::div[@class='header-top']"));
		driver.findElement(By.xpath("//img[@alt='logo']//ancestor::a[@href='index.php']"));
	}
	@Test
	public void locatorByXpathUsingPreceding()
	{
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::label[@for='inputEmail4']"));
		driver.findElement(By.xpath("//div[@id='message-two']//preceding::button[@id='button-one']"));
		driver.findElement(By.xpath("//div[@id='message-two']//preceding::div[@class='card-body']"));
		driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.findElement(By.xpath("//input[@id='button-two']//preceding::div[contains(text(),'Multiple')]"));
		driver.findElement(By.xpath("//input[@id='button-two']//preceding::input[@id='check-box-one']"));
		
	}
	@Test
	public void locatorByXpathUsingDescendant()
	{
		driver.findElement(By.xpath("//div[@class='container page']//descendant::ul[contains(@class,'list-group')]"));
		driver.findElement(By.xpath("//li[@class='list-group-item']//descendant::a[@href='simple-form-demo.php']"));
		driver.findElement(By.xpath("//form[@method='POST']//descendant::label[@for='inputEmail4']"));
		driver.findElement(By.xpath("//form[@method='POST']//descendant::button[text()='Show Message']"));
		
	}
	@Test
	public void locatorByXpathUsingFollowingSibling()
	{
		driver.findElement(By.xpath("//label[@for='inputEmail4']//following-sibling::input[@id='single-input-field']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']//following-sibling::label[@for='inlineRadio1']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div[@id='message-one']"));
		driver.findElement(By.xpath("//div[contains(text(),'Group')]//following-sibling::div[@class='card-body']"));
		driver.findElement(By.xpath("//h4[(text()='Pateints Gender')]//following-sibling::div[@id='message-two']"));
		
	}
	@Test
	public void locatorByXpathUsingSelf()
	{
		driver.findElement(By.xpath("//button[@id='button-one']//self::button"));
	}
	

}
