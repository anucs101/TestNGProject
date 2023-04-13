package com.anu.TestNGProject;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerClass  extends Base
{
	@Test
	public void testcase()
	{
	Faker faker = new Faker();
	// To generate valid random first name
	System.out.println("First name is: "+faker.name().firstName());
	// To generate valid random last name
	System.out.println("Last name is: "+faker.name().lastName());
	// To generate valid random city name
	System.out.println("City name is: "+faker.address().cityName());
	// To generate valid random state name
	System.out.println("State name is: "+faker.address().state());
	// To generate valid random country name
	System.out.println("Country name is: "+faker.address().country());
	// To generate valid random cell number
	System.out.println("Cell number is: "+faker.phoneNumber().cellPhone());
	// To generate valid random animal name
	System.out.println("Animal name is: "+faker.animal().name());
	System.out.println("Email is: "+faker.bothify("Amod##167??789"));
	System.out.println(faker.bothify("???##@gmail.com"));
	}

}
