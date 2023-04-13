package com.anu.TestNGProject;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvidersample 

{
	@Test
	@Parameters({"author","searchkey"})
	public void testcase(String author,String searchkey)
	{
		System.out.println(searchkey);
		System.out.println(author);
	}
	@Test(dataProvider="LoginProvider")
	public void dataproviderSample(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@DataProvider(name="LoginProvider")
	public Object[][] getDataFromDataprovider()
	{
	    return new Object[][] 
	    	{
	            { "Renju", "renju123" },
	            { "Anu", "anu123" },
	            { "swapna","457"}	
	    	};
	    }
	 }

