package com.anu.TestNGProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations
{	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@Test
	public void test1()
	{
		System.out.println("test 1");
	}
	@Test
	public void test2()
	{
		System.out.println("test 2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("after test");
	}
	@BeforeSuite
	public void beforeSuit()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void afterSuit()
	{
		System.out.println("After suite");
	}
	

}
