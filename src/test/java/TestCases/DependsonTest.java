package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class DependsonTest extends TestBase  {
	
    LoginPage login;   //= new LoginPage();   //object creation first part
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();      //here completed the object creation
	}
	
	@Test
	public void verifyTitleTest() throws Exception
	{
		String expTitle = "Swag Labs";
		String actTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title of web application:- " + actTitle);
	}
	
	@Test(dependsOnMethods = "verifyTitleTest")
	public void	loginToAppTest() throws	Exception
	{
	String	expRes = "https://www.saucedemo.com/inventory.html";
	String	actRes = login.loginToApp();
	Assert.assertEquals(expRes,	actRes);
	Reporter.log("URL of web application:- " + actRes);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}
