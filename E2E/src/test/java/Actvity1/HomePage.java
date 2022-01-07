package Actvity1;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import Resource.Base;

//import org.junit.Test;

public class HomePage extends Base{
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
@Test
public void basePageNavigation() throws IOException
{
	driver=initializeDriver();
	driver.get("http://qaclickacademy.com");
	//One is Inheritance
	//creating Object to that class and invoke methods of it
	
	LandingPage l=new LandingPage(driver);//Creating Object- Invoke methods
	l.getLogin().click();
	LoginPage e=new LoginPage(driver);
	e.getEmail().sendKeys("Hii");
	LoginPage p=new LoginPage(driver);
	p.getPassword().sendKeys("123");
	LoginPage lp=new LoginPage(driver);
	lp.getLoginLp().click();
	}
@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
	
}
}
