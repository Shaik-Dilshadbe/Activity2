package Actvity1;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resource.Base;

//import org.junit.Test;

public class HomePage_ValidateConatctNavigation extends Base{
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
@Test

public void basePageNavigation() throws IOException
{
	//One is Inheritance
	//creating Object to that class and invoke methods of it
	
	LandingPage l=new LandingPage(driver);//Creating Object- Invoke methods
	Assert.assertTrue(l.getContact().isDisplayed());
	//Assert.assertFalse(false);
}
@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
}
}
