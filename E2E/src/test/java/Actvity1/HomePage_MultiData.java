package Actvity1;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginPage;
import Resource.Base;

//import org.junit.Test;

public class HomePage_MultiData extends Base{
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		//driver.get(prop.getProperty("url"));
	}
	
@Test(dataProvider="getData")

public void basePageNavigation(String  Username,String Password,String Text) throws IOException
{
	//One is Inheritance
	//creating Object to that class and invoke methods of it
	driver.get(prop.getProperty("url"));
	LandingPage l=new LandingPage(driver);//Creating Object- Invoke methods
	l.getLogin().click();
	LoginPage lp=new LoginPage(driver);
	lp.getEmail().sendKeys(Username);
	lp.getPassword().sendKeys(Password);
	System.out.println(Text);
	lp.getLoginLp().click();
	}
@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
}
@DataProvider
public Object[][] getData()
{
	//Row stands for how many different data types test should run
	//coloumn stands for  how many values for each test
	Object[][] data=new Object[2][3];//2-0,1   1-0   3-0,1,2
	//1st
	data[0][0]="shaik@gmail.com";
	data[0][1]="123";
	data[0][2]="Restricted User";
	//2nd
	data[1][0]="dilsha@gmail.com";
	data[1][1]="345";
	data[1][2]="Non Restricted User";
	return data;
	
}


}
