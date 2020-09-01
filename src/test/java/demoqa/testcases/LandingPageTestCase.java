package demoqa.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import demoqa.utility.Base;

public class LandingPageTestCase {
	Base base = new Base();
	
	@Test
	public void verifyTitleOnLandingPage() throws Exception
	{
		base.launchURL();
		String actual = base.driver.getTitle();
		String expected = base.prop.getProperty("title");
		
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("Landed on expected page");
		}else {
			System.out.println("Please enter correct url");
		}
	}

}
